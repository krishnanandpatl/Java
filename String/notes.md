# Interning
If there is s1="hello" and s2 also ="Hello" then java won't create another heap instead it will copy the same address of the heap to the stack and point s2 to address of s1. It is done to save Space. In stack s1 will refer to a address of heap where string is located.
* To avoid interning we use s3=new String("Hello");
* Note:- Here heap also refers to a character shell while heap will have its address. So when we create new string using `new` the character address remains same only adress of heap changes or the shell object address changes.
## Implication of it
* Comparison\
 While comparing don,t use == use `equals`\
s1==s2 give True (due to same address)\
s1==s3 give False (due to different address)\
So we use s1.equals(s3) this will check charby char and return true.
* Immutability\
Reference is mutable, instance is not i.e. upon changing the string new reference is created instead on changing the string.
* Note:- This caused slow performance of string. Whenever string is changed character are added and new reference is created which increases the work i.e. double work is done.\
There is no function to change strings cause it will lead to more changes in different string which are using it's reference.