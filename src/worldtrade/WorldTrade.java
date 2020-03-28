/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldtrade;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class WorldTrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] coins=new int[n];
        for (int i=0;i<n;i++){
           coins[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=n-1;i>=0;i--){
            sum+=k/coins[i];
            k=k%coins[i];
            if (k==0) break;            
        }
        if (k==0) System.out.println(sum);
        else System.out.println(-1);
    }
    
}
/*
    Declare: ArrayList<ElementType> list=new ArrayList();
    Add an element at the end: list.add(element);
    Remove an element : list.remove(element);
    Remove an element at position i: list.removeAt(i);
    Insert an element at position i: list.add(i,element);
    Clear the arrylist: list.clear();
    Check if contains an element: if (list.contains(element)) {...}
    */
