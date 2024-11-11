class Dec2Hex {
    public static void main(String args[]) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.err.println("Error: No input provided. Please provide an integer input.");
            return; // Exit the program if no argument is provided
        }

        int arg1;
        try {
            // Try to parse the argument as an integer
            arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please provide a valid integer.");
            return; // Exit the program if the input is not a valid integer
        }

        // Conversion process
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int remainder, number = arg1;
        String hexadecimal = "";

        System.out.println("Converting the Decimal Value " + number + " to Hex...");

        // Perform the decimal-to-hexadecimal conversion
        while (number != 0) {
            remainder = number % 16;
            hexadecimal = hexChars[remainder] + hexadecimal;
            number = number / 16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}

