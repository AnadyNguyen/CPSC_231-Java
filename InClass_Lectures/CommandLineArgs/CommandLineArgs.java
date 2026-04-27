public class CommandLineArgs {
    /*
    main method signautre
        public - access from anywhere
        static - no calling object
        void - no return type
        main - method name
        String[] - string array
        args - name of the string array, parameter 
    */

    public static void main(String [] args) {
        // args = ["chapman", "university", "california"]; //hypothetical array
        // args [0], args[1], etc...

        // System.out.println("Args 0:" + args[0]); //cannot reference 0 if array doesnt exist
        // System.out.println("Args 1:" + args[1]);  

        for (int i = 0; i < args.length; i++) { //for if amount of input is unknown
            System.out.println("Arg" + i + ": " + args[i]);
        }
    }
}