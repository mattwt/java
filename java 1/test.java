public class test { 
public static void main(String[] args) { 
int[ ] list1 = {3, 2, 1}; 
int[ ] list2 = {1, 2, 3}; 
list2 = list1; 
list1[0] = 0; 
//list1[1] = 1;
//list2[2] = 2; 
for (int i = list2.length - 1; i >= 0; i--) 
System.out.print(list2[i] + " "); 
} 
} 