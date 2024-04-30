public class Nodes{
variable lv=null;
variable rv=null;
Nodes ln=null;
Nodes rn=null;
Double lc=null;
Double rc=null;
Double dv=null;
Double dn=null;
public double output=0.0;
public Nodes(double a,variable b){
this.lc=a;
this.rv=b;
this.dv=0.0;
}
public Nodes(variable a){
this.lv=a;
this.dv=0.0;
}
public Nodes(Nodes a){
this.ln=a;
this.dn=0.0;
}
public Nodes(double a,Nodes b){
this.lc=a;
this.rn=b;
this.dn=0.0;
}
public Nodes(variable b,double a){
this.rc=a;
this.lv=b;
this.dv=0.0;
}
public Nodes(Nodes b,double a){
this.rc=a;
this.ln=b;
this.dn=0.0;
}
public Nodes(Nodes a,variable b){
this.ln=a;
this.rv=b;
this.dn=0.0;
this.dv=0.0;
}
public Nodes(variable b,Nodes a){
this.rn=a;
this.lv=b;
this.dn=0.0;
this.dv=0.0;
}
public Nodes(variable a,variable b){
this.lv=a;this.rv=b;
this.dv=0.0;this.dn=0.0;
}
public Nodes(Nodes a,Nodes b){
this.ln=a;this.rn=b;
this.dn=0.0;this.dv=0.0;
}
public void add(){
if(this.lc!=null&&this.rv!=null){
this.output=(this.lc+this.rv.value);
this.dv=1.0;
}
else if(this.lc!=null&&this.rn!=null){
this.output=(this.lc+this.rn.output);
this.dn=1.0;
}
else if(this.lv!=null&&this.rc!=null){
this.output=(this.lv.value+this.rc);
this.dv=1.0;
}
else if(this.ln!=null&&this.rc!=null){
this.output=(this.ln.output+this.rc);
this.dn=1.0;
}
else if(this.ln!=null&&this.rv!=null){
this.output=(this.ln.output+this.rv.value);
this.dv=1.0;
this.dn=1.0;
}
else if(this.lv!=null&&this.rn!=null){
this.output=(this.lv.value+this.rn.output);
this.dv=1.0;
this.dn=1.0;
}
else if(this.lv!=null&&this.rv!=null){
this.output=(this.lv.value+this.rv.value);
this.dv=1.0;this.dn=1.0;
}
else{
this.output=(this.ln.output+this.rn.output);
this.dv=1.0;this.dn=1.0;
}
}
public void sub(){
if(this.lc!=null&&this.rv!=null){
this.output=(this.lc-this.rv.value);
this.dv=-1.0;
}
else if(this.lc!=null&&this.rn!=null){
this.output=(this.lc-this.rn.output);
this.dn=-1.0;
}
else if(this.lv!=null&&this.rc!=null){
this.output=(this.lv.value-this.rc);
this.dv=1.0;
}
else if(this.ln!=null&&this.rc!=null){
this.output=(this.ln.output-this.rc);
this.dn=1.0;
}
else if(this.ln!=null&&this.rv!=null){
this.output=(this.ln.output-this.rv.value);
this.dv=-1.0;
this.dn=1.0;
}
else if(this.lv!=null&&this.rn!=null){
this.output=(this.lv.value-this.rn.output);
this.dv=1.0;
this.dn=-1.0;
}
else if(this.lv!=null&&this.rv!=null){
this.output=(this.lv.value-this.rv.value);
this.dv=1.0;this.dn=-1.0;
}
else{
this.output=(this.ln.output-this.rn.output);
this.dv=-1.0;this.dn=1.0;
}
}
public void mul(){
if(this.lc!=null&&this.rv!=null){
this.output=(this.lc*this.rv.value);
this.dv=this.lc;
}
else if(this.lc!=null&&this.rn!=null){
this.output=(this.lc*this.rn.output);
this.dn=this.lc;
}
else if(this.lv!=null&&this.rc!=null){
this.output=(this.lv.value*this.rc);
this.dv=this.rc;
}
else if(this.ln!=null&&this.rc!=null){
this.output=(this.ln.output*this.rc);
this.dn=this.rc;
}
else if(this.ln!=null&&this.rv!=null){
this.output=(this.ln.output*this.rv.value);
this.dv=this.ln.output;
this.dn=this.rv.value;
}
else if(this.lv!=null&&this.rn!=null){
this.output=(this.lv.value*this.rn.output);
this.dv=this.rn.output;
this.dn=this.lv.value;
}
else if(this.lv!=null&&this.rv!=null){
this.output=(this.lv.value*this.rv.value);
this.dv=this.rv.value;this.dn=this.lv.value;
}
else{
this.output=(this.ln.output*this.rn.output);
this.dv=this.ln.output;this.dn=this.rn.output;
}
}
public void div(){
if(this.lc!=null&&this.rv!=null){
this.output=(this.lc/this.rv.value);
this.dv=-(this.lc/(this.rv.value*this.rv.value));
}
else if(this.lc!=null&&this.rn!=null){
this.output=(this.lc/this.rn.output);
this.dn=-(this.lc/(this.rn.output*this.rn.output));
}
else if(this.lv!=null&&this.rc!=null){
this.output=(this.lv.value/this.rc);
this.dv=1.0/this.rc;
}
else if(this.ln!=null&&this.rc!=null){
this.output=(this.ln.output/this.rc);
this.dn=1.0/this.rc;
}
else if(this.ln!=null&&this.rv!=null){
this.output=(this.ln.output/this.rv.value);
this.dv=-(this.ln.output/(this.rv.value*this.rv.value));
this.dn=1.0/this.rv.value;
}
else if(this.lv!=null&&this.rn!=null){
this.output=(this.lv.value/this.rn.output);
this.dv=1.0/this.rn.output;
this.dn=-(this.lv.value/(this.rn.output*this.rn.output));
}
else if(this.lv!=null&&this.rv!=null){
this.output=(this.lv.value/this.rv.value);
this.dv=1.0/this.rv.value;
this.dn=-(this.lv.value/(this.rv.value*this.rv.value));
}
else{
this.output=(this.ln.output/this.rn.output);
this.dv=-(this.ln.output/(this.rn.output*this.rn.output));
this.dn=1.0/this.rn.output;
}
}
public void pow(){
if(this.lc!=null&&this.rv!=null){
this.output=Math.pow(this.lc,this.rv.value);
this.dv=Math.log(this.lc)*this.output; 
}
else if(this.lc!=null&&this.rn!=null){
this.output=Math.pow(this.lc,this.rn.output);
this.dn=Math.log(this.lc)*this.output;
}
else if(this.lv!=null&&this.rc!=null){
this.output=Math.pow(this.lv.value,this.rc);
this.dv=Math.pow(this.lv.value,this.rc-1)*this.rc;
}
else if(this.ln!=null&&this.rc!=null){
this.output=Math.pow(this.ln.output,this.rc);
this.dn=Math.pow(this.ln.output,this.rc-1)*this.rc;
}
else if(this.ln!=null&&this.rv!=null){
this.output=Math.pow(this.ln.output,this.rv.value);
this.dv=Math.log(this.ln.output)*this.output;
this.dn=Math.pow(this.ln.output,this.rv.value-1)*this.rv.value;
}
else if(this.lv!=null&&this.rn!=null){
this.output=Math.pow(this.lv.value,this.rn.output);
this.dv=Math.pow(this.lv.value,this.rn.output-1)*this.rn.output;
this.dn=Math.log(this.lv.value)*this.output;
}
else if(this.lv!=null&&this.rv!=null){
this.output=Math.pow(this.lv.value,this.rv.value);
this.dv=Math.pow(this.lv.value,this.rv.value-1)*this.rv.value;
this.dn=Math.log(this.lv.value)*this.output;
}
else{
this.output=Math.pow(this.ln.output,this.rn.output);
this.dv=Math.log(this.ln.output)*this.output;
this.dn=Math.pow(this.ln.output,this.rn.output-1)*this.rn.output;
}
}
void log(){
if(this.lv!=null && this.rv==null && this.rn==null && this.rc==null)
{
this.output=Math.log(this.lv.value);
this.dv=1.0/this.lv.value;
}
else if(this.ln!=null && this.rv==null && this.rn==null && this.rc==null){
this.output=Math.log(this.ln.output);
this.dn=1.0/this.ln.output;
}
}
void backward(double a){
if(a==0.0 || a==Math.sqrt(-1)){return;}
if(this.ln!=null && this.rn==null && this.rv==null && this.rc==null){
this.ln.backward(a*this.dn);
return;
}
else if(this.lv!=null && this.rn==null && this.rv==null && this.rc==null){
this.lv.derivative+=(a*this.dn);
return;
}
if(this.rn!=null && this.ln!=null){
this.ln.backward(a*this.dn);
this.rn.backward(a*this.dv);
return;
}
if(this.rv!=null && this.lv!=null){
this.lv.derivative+=(a*this.dv);
this.rv.derivative+=(a*this.dn);
return;
}
if(this.ln!=null)
this.ln.backward(a*this.dn);
if(this.rn!=null)
this.rn.backward(a*this.dn);
if(this.rv!=null){
this.rv.derivative+=(a*this.dv);
}
if(this.lv!=null){
this.lv.derivative+=(a*this.dv);
}
}
public String toString(){
return Double.toString(output);
}
public void backward(){
this.backward(1.0);
}
}
