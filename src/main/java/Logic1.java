package src.main.java;

public class Logic1 {
    public static void main(String[] args) {
        Logic1 logicDriver = new Logic1();
        // All test cases;
        System.out.println(logicDriver.old35(3));
        System.out.println(logicDriver.old35(10));
        System.out.println(logicDriver.old35(15));
        System.out.println(logicDriver.specialEleven(22));
        System.out.println(logicDriver.specialEleven(23));
        System.out.println(logicDriver.specialEleven(24));
        System.out.println(logicDriver.more20(20));
        System.out.println(logicDriver.more20(21));
        System.out.println(logicDriver.more20(42));
        System.out.println(logicDriver.less20(18));
        System.out.println(logicDriver.less20(59));
        System.out.println(logicDriver.less20(20));
        System.out.println(logicDriver.nearTen(12));
        System.out.println(logicDriver.nearTen(17));
        System.out.println(logicDriver.nearTen(19));
        System.out.println(logicDriver.sortaSum(3, 4));
        System.out.println(logicDriver.sortaSum(9, 4));
        System.out.println(logicDriver.sortaSum(10, 11));
        System.out.println(logicDriver.in1To10(5, false));
        System.out.println(logicDriver.in1To10(11, false));
        System.out.println(logicDriver.in1To10(11, true));
        System.out.println(logicDriver.teenSum(3, 4));
        System.out.println(logicDriver.teenSum(10, 13));
        System.out.println(logicDriver.teenSum(13, 2));
        System.out.println(logicDriver.love6(6, 4));
        System.out.println(logicDriver.love6(4, 5));
        System.out.println(logicDriver.love6(1, 5));
        System.out.println(logicDriver.lastDigit(23, 19, 13));
        System.out.println(logicDriver.lastDigit(23, 19, 12));
        System.out.println(logicDriver.lastDigit(23, 19, 3));
        System.out.println(logicDriver.answerCell(false, false, false));
        System.out.println(logicDriver.answerCell(false, false, true));
        System.out.println(logicDriver.answerCell(true, false, false));
        System.out.println(logicDriver.alarmClock(1, false));
        System.out.println(logicDriver.alarmClock(5, false));
        System.out.println(logicDriver.alarmClock(0, false));
        System.out.println(logicDriver.teaParty(6, 8));
        System.out.println(logicDriver.teaParty(3, 8));
        System.out.println(logicDriver.teaParty(20, 6));
        System.out.println(logicDriver.redTicket(2, 2, 2));
        System.out.println(logicDriver.redTicket(2, 2, 1));
        System.out.println(logicDriver.redTicket(0, 0, 0));
        System.out.println(logicDriver.greenTicket(1, 2, 3));
        System.out.println(logicDriver.greenTicket(2, 2, 2));
        System.out.println(logicDriver.greenTicket(1, 1, 2));
        System.out.println(logicDriver.squirrelPlay(70, false));
        System.out.println(logicDriver.squirrelPlay(95, false));
        System.out.println(logicDriver.squirrelPlay(95, true));
        System.out.println(logicDriver.caughtSpeeding(60, false));
        System.out.println(logicDriver.caughtSpeeding(65, false));
        System.out.println(logicDriver.caughtSpeeding(65, true));
        System.out.println(logicDriver.dateFashion(5, 10));
        System.out.println(logicDriver.dateFashion(5, 2));
        System.out.println(logicDriver.dateFashion(5, 5));
        System.out.println(logicDriver.fizzString2(1));
        System.out.println(logicDriver.fizzString2(5));
        System.out.println(logicDriver.fizzString2(3));
        System.out.println(logicDriver.fizzString2(15));
        System.out.println(logicDriver.sodaParty(30, false));
        System.out.println(logicDriver.sodaParty(50, false));
        System.out.println(logicDriver.sodaParty(70, true));
    }

    public Logic1() {
    }

    // ONLY EDIT BELOW HERE-------------------------------------------------------------------------

    public boolean old35(int p) {
        if ((p % 3 == 0) ^ (p % 5 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean specialEleven(int p) {
        if ((p % 11 == 0) || (p % 11 == 1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean more20(int p) {
        if ((p % 20 == 1) || (p % 20 == 2)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean less20(int p) {
        if ((p % 20 == 18) || (p % 20 == 19)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean nearTen(int num) {
        if ((num % 10 <= 2) || (num % 10 >= 8)) {
            return true;
        } else {
            return false;
        }
    }

    public int sortaSum(int m, int n) {
        int sum = m + n;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }

    public boolean in1To10(int p, boolean outsideMode) {
        if ((outsideMode == true && p <= 1) || (outsideMode == true && p >= 10)) {
            return true;
        } else if (p >= 1 && p <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public int teenSum(int m, int n) {
        if ((m >= 13 && m <= 19) || (n >= 13 && n <= 19)) {
            return 19;
        } else {
            return m + n;
        }
    }

    public boolean love6(int m, int n) {
        if (m == 6 || n == 6 || m + n == 6 || Math.abs(m - n) == 6) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lastDigit(int m, int n, int o) {
        if ((m % 10 == n % 10) || (n % 10 == o % 10) || (m % 10 == o % 10)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean answerCell(boolean morning, boolean mom, boolean asleep) {
        if (asleep == true) {
            return false;
        }
        if (morning == true) {
            if (mom == true) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public String alarmClock(int day, boolean vaca) {
        if (vaca == true) {
            if (day == 0 || day == 6) {
                return "off";
            } else {
                return "10:00";
            }
        } else if (day == 0 || day == 6) {
            return "10:00";
        } else {
            return "7:00";
        }
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }

        if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        } else {
            return 1;
        }
    }

    public int redTicket(int m, int n, int o) {
        if (m == 2 && n == 2 && o == 2) {
            return 10;
        }
        if (m == n && n == o) {
            return 5;
        }
        if (m != n && m != o) {
            return 1;
        } else {
            return 0;
        }
    }

    public int greenTicket(int m, int n, int o) {
        if (m == n && n == o) {
            return 20;
        }
        if (m == n || n == o || m == o) {
            return 10;
        } else {
            return 0;
        }
    }

    public boolean squirrelPlay(int temperature, boolean summer) {
        if (summer == true) {
            if (temperature >= 60 && temperature <= 100) {
                return true;
            } else {
                return false;
            }
        } else if (temperature >= 60 && temperature <= 90) {
            return true;
        } else {
            return false;
        }
    }

    public int caughtSpeeding(int speed, boolean birthday) { // Fixed typo here
        if (birthday == true) {
            if (speed <= 65) {
                return 0;
            } else if (speed >= 66 && speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (speed <= 60) {
                return 0;
            } else if (speed >= 61 && speed <= 80) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public int dateFashion(int u, int date) {
        if (u <= 2 || date <= 2) {
            return 0;
        } else if ((u >= 8 && date >= 8) || (u >= 8 || date >= 8)) {
            return 2;
        } else {
            return 1;
        }
    }

    public String fizzString2(int p) {
        if (p % 3 == 0 && p % 5 == 0) {
            return "FizzBuzz!";
        } else if (p % 3 == 0) {
            return "Fizz!";
        } else if (p % 5 == 0) {
            return "Buzz!";
        } else {
            return p + "!";
        }
    }

    public boolean sodaParty(int sodas, boolean weekend) {
        if (weekend == true) {
            if (sodas >= 40) {
                return true;
            } else {
                return false;
            }
        } else {
            if (sodas >= 40 && sodas <= 60) {
                return true;
            } else {
                return false;
            }
        }
    }

}
