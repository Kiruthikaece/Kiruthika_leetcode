class StringImmutable {
    public static void main(String[] args) {
        String str="Hi all";
        System.out.print("\noriginal string:");
        System.out.print(str);
        str.replace(str.substring(0,2),"Hello");
        System.out.print("\nModified string:");
        System.out.println(str);
        
    }
}

//output
// original string:Hi all
// Modified string:Hi all