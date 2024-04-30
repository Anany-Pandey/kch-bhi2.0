public class Matrix{
public static variable[][] matrix(double[][] data){
variable[][] a=new variable[data.length][data[0].length];
for(int i=0;i<data.length;i++){
for(int j=0;j<data[0].length;j++)
a[i][j]=new variable(data[i][j]);
}
return a;
}
public static variable[][] matrix(int m,int n){
variable[][] a=new variable[m][n];
for(int i=0;i<m;i++){
for(int j=0;j<n;j++)
a[i][j]=new variable(Math.random());
}
return a;
}
public static Nodes[][] matmul(variable[][] a,double[][] b){
Nodes[][] output=new Nodes[a.length][b[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<b[0].length;j++){
Nodes previousNode=null;
for(int k=0;k<b.length;k++){
if(previousNode==null){
Nodes mulnode=new Nodes(a[i][k],b[k][j]);
Nodes addnode=new Nodes(mulnode,0);
mulnode.mul();
addnode.add();
previousNode=addnode;
}
else{
Nodes mulnode=new Nodes(a[i][k],b[k][j]);
Nodes addnode=new Nodes(mulnode,previousNode);
mulnode.mul();
addnode.add();
previousNode=addnode;
}
}
output[i][j]=previousNode;
}
}
return output;
}
public static Nodes[][] matmul(variable[][] a,Nodes[][] b){
Nodes[][] output=new Nodes[a.length][b[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<b[0].length;j++){
Nodes previousNode=null;
for(int k=0;k<b.length;k++){
if(previousNode==null){
Nodes mulnode=new Nodes(a[i][k],b[k][j]);
Nodes addnode=new Nodes(mulnode,0);
mulnode.mul();
addnode.add();
previousNode=addnode;
}
else{
Nodes mulnode=new Nodes(a[i][k],b[k][j]);
Nodes addnode=new Nodes(mulnode,previousNode);
mulnode.mul();
addnode.add();
previousNode=addnode;
}
}
output[i][j]=previousNode;
}
}
return output;
}
public static Nodes[][] matmul(variable[][] a,variable[][] b){
Nodes[][] output=new Nodes[a.length][b[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<b[0].length;j++){
Nodes previousNode=null;
for(int k=0;k<b.length;k++){
if(previousNode==null){
Nodes mulnode=new Nodes(a[i][k],b[k][j]);
Nodes addnode=new Nodes(mulnode,0);
mulnode.mul();
addnode.add();
previousNode=addnode;
}
else{
Nodes mulnode=new Nodes(a[i][k],b[k][j]);
Nodes addnode=new Nodes(mulnode,previousNode);
mulnode.mul();
addnode.add();
previousNode=addnode;
}
}
output[i][j]=previousNode;
}
}
return output;
}
public static Nodes[][] add(variable[][] a,double[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].add();
}
}
return output;
}
public static Nodes[][] sub(variable[][] a,double[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].sub();
}
}
return output;
}
public static Nodes[][] add(variable[][] a,variable[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].add();
}
}
return output;
}
public static Nodes[][] sub(variable[][] a,variable[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].sub();
}
}
return output;
}
public static Nodes[][] add(variable[][] a,Nodes[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].add();
}
}
return output;
}
public static Nodes[][] sub(variable[][] a,Nodes[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].sub();
}
}
return output;
}
public static Nodes[][] mul(variable[][] a,Nodes[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].mul();
}
}
return output;
}
public static Nodes[][] mul(variable[][] a,variable[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].mul();
}
}
return output;
}
public static Nodes[][] mul(variable[][] a,double[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].mul();
}
}
return output;
}
public static Nodes[][] div(variable[][] a,double[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].div();
}
}
return output;
}
public static Nodes[][] div(variable[][] a,variable[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].div();
}
}
return output;
}
public static Nodes[][] div(variable[][] a,Nodes[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].div();
}
}
return output;
}
public static Nodes[][] div(Nodes[][] a,Nodes[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].div();
}
}
return output;
}
public static Nodes[][] div(Nodes[][] a,variable[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].div();
}
}
return output;
}
public static Nodes[][] pow(Nodes[][] a,double b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b);
output[i][j].pow();
}
}
return output;
}
public static Nodes[][] pow(double b,Nodes[][] a){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(b,a[i][j]);
output[i][j].pow();
}
}
return output;
}
public static Nodes mean(Nodes[][] a){
Nodes prevNodes=null;
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
if(prevNodes==null){
Nodes add=new Nodes(0,a[i][j]);
add.add();
prevNodes=add;
}
else{
Nodes add=new Nodes(prevNodes,a[i][j]);
add.add();
prevNodes=add;
}
}
}
Nodes mean=new Nodes(prevNodes,1.0/(a.length*a[0].length));
mean.mul();
return mean;
}
public static Nodes mean(variable[][] a){
Nodes prevNodes=null;
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
if(prevNodes==null){
Nodes add=new Nodes(0,a[i][j]);
add.add();
prevNodes=add;
}
else{
Nodes add=new Nodes(prevNodes,a[i][j]);
add.add();
prevNodes=add;
}
}
}
Nodes mean=new Nodes(prevNodes,1.0/(a.length*a[0].length));
mean.mul();
return mean;
}
public static Nodes sum(Nodes[][] a){
Nodes prevNodes=null;
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
if(prevNodes==null){
Nodes add=new Nodes(0,a[i][j]);
add.add();
prevNodes=add;
}
else{
Nodes add=new Nodes(prevNodes,a[i][j]);
add.add();
prevNodes=add;
}
}
}
return prevNodes;
}
public static Nodes sum(variable[][] a){
Nodes prevNodes=null;
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
if(prevNodes==null){
Nodes add=new Nodes(0,a[i][j]);
add.add();
prevNodes=add;
}
else{
Nodes add=new Nodes(prevNodes,a[i][j]);
add.add();
prevNodes=add;
}
}
}
return prevNodes;
}
public static Nodes[][] matmul(Nodes[][] a,double[][] b){
Nodes[][] output=new Nodes[a.length][b[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<b[0].length;j++){
Nodes previousNode=null;
for(int k=0;k<b.length;k++){
if(previousNode==null){
Nodes mulnode=new Nodes(a[i][k],b[k][j]);
Nodes addnode=new Nodes(mulnode,0);
mulnode.mul();
addnode.add();
previousNode=addnode;
}
else{
Nodes mulnode=new Nodes(a[i][k],b[k][j]);
Nodes addnode=new Nodes(mulnode,previousNode);
mulnode.mul();
addnode.add();
previousNode=addnode;
}
}
output[i][j]=previousNode;
}
}
return output;
}
public static Nodes[][] matmul(Nodes[][] a,Nodes[][] b){
Nodes[][] output=new Nodes[a.length][b[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<b[0].length;j++){
Nodes previousNode=null;
for(int k=0;k<b.length;k++){
if(previousNode==null){
Nodes mulnode=new Nodes(a[i][k],b[k][j]);
Nodes addnode=new Nodes(mulnode,0);
mulnode.mul();
addnode.add();
previousNode=addnode;
}
else{
Nodes mulnode=new Nodes(a[i][k],b[k][j]);
Nodes addnode=new Nodes(mulnode,previousNode);
mulnode.mul();
addnode.add();
previousNode=addnode;
}
}
output[i][j]=previousNode;
}
}
return output;
}
public static Nodes[][] matmul(Nodes[][] a,variable[][] b){
Nodes[][] output=new Nodes[a.length][b[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<b[0].length;j++){
Nodes previousNode=null;
for(int k=0;k<b.length;k++){
if(previousNode==null){
Nodes mulnode=new Nodes(a[i][k],b[k][j]);
Nodes addnode=new Nodes(mulnode,0);
mulnode.mul();
addnode.add();
previousNode=addnode;
}
else{
Nodes mulnode=new Nodes(a[i][k],b[k][j]);
Nodes addnode=new Nodes(mulnode,previousNode);
mulnode.mul();
addnode.add();
previousNode=addnode;
}
}
output[i][j]=previousNode;
}
}
return output;
}
public static Nodes[][] add(Nodes[][] a,double[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].add();
}
}
return output;
}
public static Nodes[][] sub(Nodes[][] a,double[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].sub();
}
}
return output;
}
public static Nodes[][] add(Nodes[][] a,variable[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].add();
}
}
return output;
}
public static Nodes[][] sub(Nodes[][] a,variable[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].sub();
}
}
return output;
}
public static Nodes[][] add(Nodes[][] a,Nodes[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].add();
}
}
return output;
}
public static Nodes[][] sub(Nodes[][] a,Nodes[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].sub();
}
}
return output;
}
public static Nodes[][] mul(Nodes[][] a,Nodes[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].mul();
}
}
return output;
}
public static Nodes[][] mul(Nodes[][] a,variable[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].mul();
}
}
return output;
}
public static Nodes[][] mul(Nodes[][] a,double[][] b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b[i][j]);
output[i][j].mul();
}
}
return output;
}
public static Nodes[][] log(Nodes[][] a){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j]);
output[i][j].log();
}
}
return output;
}
public static Nodes[][] log(variable[][] a){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j]);
output[i][j].log();
}
}
return output;
}
public static Nodes[][] add(variable[][] a,double b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b);
output[i][j].add();
}
}
return output;
}
public static Nodes[][] add(Nodes[][] a,double b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b);
output[i][j].add();
}
}
return output;
}
public static Nodes[][] sub(variable[][] a,double b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b);
output[i][j].sub();
}
}
return output;
}
public static Nodes[][] sub(Nodes[][] a,double b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b);
output[i][j].sub();
}
}
return output;
}
public static Nodes[][] mul(variable[][] a,double b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b);
output[i][j].mul();
}
}
return output;
}
public static Nodes[][] mul(Nodes[][] a,double b){
Nodes[][] output=new Nodes[a.length][a[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
output[i][j]=new Nodes(a[i][j],b);
output[i][j].mul();
}
}
return output;
}
public static Nodes[][] T(Nodes[][] a){
Nodes[][] b=new Nodes[a[0].length][a.length];
for(int i=0;i<a[0].length;i++){
for(int j=0;j<a.length;j++)
b[i][j]=a[j][i];
}
return b;
}
public static variable[][] T(variable[][] a){
variable[][] b=new variable[a[0].length][a.length];
for(int i=0;i<a[0].length;i++){
for(int j=0;j<a.length;j++)
b[i][j]=a[j][i];
}
return b;
}
public static double[][] T(double [][] a){
double [][] c = new double[a[0].length][a.length];
for(int i=0;i<c.length;i++){
for(int j=0;j<c[0].length;j++){
    c[i][j]=a[j][i];
}
}
return c;
}
}
