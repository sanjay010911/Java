class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        // Bitwise AND (&) operator
        int a = 5;  // binary: 0101
        int b = 3;  // binary: 0011
        int bitwiseAndResult = a & b;
        System.out.println("Bitwise AND result: " + bitwiseAndResult);

        // Bitwise OR (|) operator
        int bitwiseOrResult = a | b;
        System.out.println("Bitwise OR result: " + bitwiseOrResult);

        // Bitwise XOR (^) operator
        int bitwiseXORResult = a ^ b;
        System.out.println("Bitwise XOR result: " + bitwiseXORResult);

        // Bitwise NOT (~) operator
        int bitwiseNotResultA = ~a;
        int bitwiseNotResultB = ~b;
        System.out.println("Bitwise NOT result for 'a': " + bitwiseNotResultA);
        System.out.println("Bitwise NOT result for 'b': " + bitwiseNotResultB);

        // Left shift (<<) operator
        int leftShiftResult = a << 1;  // Left shift 'a' by 1 position
        System.out.println("Left shift result: " + leftShiftResult);

        // Right shift (>>) operator
        int rightShiftResult = a >> 1;  // Right shift 'a' by 1 position
        System.out.println("Right shift result: " + rightShiftResult);
    }
}
