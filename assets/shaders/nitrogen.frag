#define HIGHP

//shades of nitrogen
#define S1 vec3(248.0, 236.0, 255.0) / 255.0
#define S2 vec3(245.0,233.0,255.0)/255.0
#define S3 vec3(242.0,230.0,255.0)/255.0
#define S4 vec3(239.0,227.0,255.0)/255.0
#define S5 vec3(237.0,225.0,252.0)/255.0
#define S6 vec3(234.0,222.0,250.0)/255.0
#define S7 vec3(232.0, 220.0, 247.0) / 255.0
#define NSCALE 100.0 / 2.0

uniform sampler2D u_texture;
uniform sampler2D u_noise;

uniform vec2 u_campos;
uniform vec2 u_resolution;
uniform float u_time;

varying vec2 v_texCoords;

void main(){
    vec2 c = v_texCoords.xy;
    vec2 coords = vec2(c.x * u_resolution.x + u_campos.x, c.y * u_resolution.y + u_campos.y);

    float btime = u_time / 5000.0;
    float wave = abs(0.24*sin(0.37*coords.x + 1.6*coords.y) + 0.1 * sin(3.0 * coords.x+0.5*coords.y) + 0.17 * sin(3.0 * coords.y)) / 15.0;
    float noise = wave + (texture2D(u_noise, (coords) / NSCALE + vec2(btime) * vec2(-0.2, 0.8)).r + texture2D(u_noise, (coords) / NSCALE + vec2(btime * 1.1) * vec2(0.8, -1.0)).r) / 2.0;
    vec4 color = texture2D(u_texture, c);

    //if(noise > 0.54 && noise < 0.57){
    //    color.rgb = S2;
    //}else if (noise > 0.49 && noise < 0.62){
    //    color.rgb = S1;
    //}
	float tn=abs(noise-0.555);

	if(tn<0.01) color.rgb=S1;
	else if(tn<0.02) color.rgb=S2;
	else if(tn<0.03) color.rgb=S3;
	else if(tn<0.04) color.rgb=S4;
	else if(tn <0.05) color.rgb=S5;
	else if(tn <0.06) color.rgb=S6;
	else color.rgb=S7;

    gl_FragColor = color;
}
