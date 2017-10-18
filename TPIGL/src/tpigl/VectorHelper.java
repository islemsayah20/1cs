/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tpigl;

/**
 *
 * @author Pilote
 */
public class VectorHelper {
    
public int[] Min(int[] a,int bi){
    int[] result=new int[2];
    int min=a[bi];
    int i=bi;
    while (i<=a.length-1){
    if (a[i]<min){min = a[i];
    result[0]=min;
    result[1]=i;
    }
    i++;
    }
    return result;
}
    
public int[] Max(int[] a,int bi){
    int[] result=new int[2];
    int max=a[bi];
    int i=bi;
    while (i<=a.length-1){
    if (a[i]>max){max = a[i];
    result[0]=max;
    result[1]=i;
    }
    i++;
    }
    return result;
}


public int[] trier (int[] a){
        //int[] b=new int[a.length];   
        int[] min=new int[2];
        int bi=0;
        //int m;
        while (bi<=a.length-2){
        min=Min(a,bi);
        //m=min[1];
        a[min[1]]=a[bi];
        a[bi]=min[0];
        bi++;
        }
        return a;
       }
   
public int[] sommer(int[] a,int[] b) throws DifferentException {
    int[] result;
    int i=0;
    if (a.length == b.length){throw new DifferentException();}else{
    result=new int[a.length];
    for(i=0;i<a.length;i++){
    result[i]=a[i]+b[i];
    }
    return result;
    } 
   }

public int[] inverser(int[] a ){

int[] result=new int[a.length];
int i=0;
int j=a.length-1;
while (i<= a.length){
result[i]=a[j];
i++;
j--;
}
return result;
}


public int[] MinMax(int[] a){
    int[] result=new int[2];
    int[] m=Min(a,0);
    result[0]=m[0];
    m=Max(a,0);
    result[1]=m[0];
    return result;
}





public int[] function(){return null ;
} 

}
