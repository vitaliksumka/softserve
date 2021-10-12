package Conditions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Is_n_divisible_by_x_and_y {
    public static boolean isDivisible(long n, long x, long y) {
        boolean flag = false;
        if (n >= 1 || x >= 1 || y >= 1) {
            long result1 = n % x;
            long result2 = n % y;
            if (result1 == 0 && result2 == 0) {
                flag = true;
                System.out.println(flag + " because" + n + " is divisible by " + x + " and " + y);
            } else {
                flag = false;
                System.out.println(flag + " because" + n + " is not divisible by " + x + " and " + y);
            }
        }
        return flag;
    }
}
