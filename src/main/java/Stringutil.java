import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Stringutil
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean isNumber = StringUtils.isNumeric(input);
        String swapCase = StringUtils.swapCase(input);
        String reverseString = StringUtils.reverse(input);

        System.out.println(isNumber);
        System.out.println(swapCase);
        System.out.println(reverseString);
    }
}
