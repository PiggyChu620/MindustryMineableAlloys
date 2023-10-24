#define HIGHP

//shades of cyanogen
#define S1 vec3(232.0, 128.0, 63.0) / 255.0
//#define S1 vec3(0.0,0.0,0.0)
#define S2 vec3(216.6666667,109.6666667,58.6666667)/255.0
#define S3 vec3(201.3333333,91.3333333,54.3333333)/255.0
#define S4 vec3(186.0,73.0,50.0)/255.0
#define S5 vec3(170.6666667,54.6666667,45.6666667)/255.0
#define S6 vec3(155.3333333,36.3333333,41.3333333)/255.0
#define S7 vec3(140.0, 18.0, 37.0) / 255.0
//#define S7 vec3(1.0,1.0,1.0)
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
    //float wave = 19*abs(0.011*(sin(0.2*coords.x+1.56)+cos(0.2*coords.y))-0.02);
	float wave=abs(0.14*(sin(0.2*coords.x+1.56)+cos(0.2*coords.y-0.24))+0.06*(sin(0.3*coords.x-0.3)+cos(0.35*coords.y+0.35))+0.1*(sin(0.3*coords.x-0.96)+cos(0.5*coords.y+0.45)))/20.0;
    float noise = wave + (texture2D(u_noise, (coords) / NSCALE + vec2(btime) * vec2(-0.2, 0.8)).r + texture2D(u_noise, (coords) / NSCALE + vec2(btime * 1.1) * vec2(0.8, -1.0)).r) / 2.0;
    vec4 color = texture2D(u_texture, c);

    //if(noise > 0.54 && noise < 0.57){
    //    color.rgb = S2;
    //}else if (noise > 0.49 && noise < 0.62){
    //    color.rgb = S1;
    //}
	float tn=abs(noise-0.555);

	if(tn<0.01) color.rgb=S7;
	else if(tn<0.02) color.rgb=S6;
	else if(tn<0.03) color.rgb=S5;
	else if(tn<0.04) color.rgb=S4;
	else if(tn <0.05) color.rgb=S3;
	else if(tn <0.06) color.rgb=S2;
	else color.rgb=S1;

    gl_FragColor = color;
}
