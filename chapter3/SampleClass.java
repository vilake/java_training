package chapter3;

public class SampleClass {
    public int len = 10;
    public int[] table = new int[len];

    public SampleClass() {
        for(int i = 0; i < len; i++) table[i] = i;
    }

    public String toString()
    {
        String ret = "";
        int i;
        for (i = 0; i < len - 1; i++)
            ret += table[i] + ", ";
        ret += table[i];
        return ret;
    }

    public static void main(String[] args) {
        SampleClass sc = new SampleClass();
        System.out.println(sc);
    }
    
}