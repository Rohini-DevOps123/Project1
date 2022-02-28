public static SingleObject getInstance()
{
return instance;
}
 //without refactoring
/*public boolean max(int a, int b)
 {
if(a > b)
 {
return true;
}
 else if (a == b) {
return false;
} else
 {
return false;
  
}*/
 //with refactoring
 public boolean max(int a, int b)
 {
return a > b;
}
}
}
