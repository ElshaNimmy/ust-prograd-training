public class CurrencyConverterMain {

                public static void main(String[] args) {
                    double amount, dollar, pound, code, euro, yen, ringgit, rupee;

                    DecimalFormat f = new DecimalFormat("##.##");

                    Scanner sc = new Scanner(System.in);


                    int i =0;
                    do {
                        System.out.println("Choose one from the following options");
                        System.out.println("1) Ruppees conversion");
                        System.out.println("2) Dollar conversion");
                        System.out.println("3) Pound conversion");
                        System.out.println("4) Euro conversion");
                        System.out.println("5) Yen conversion");
                        System.out.println("6) Exit ");
                        int exchange = sc.nextInt();
                        switch (exchange) {
                            case 1: {
                                System.out.println("How much Money you want to convert ?");
                                amount = sc.nextFloat();
                                if(amount >=0){
                                dollar = amount / 70;
                                System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");

                                pound = amount / 88;
                                System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");

                                euro = amount / 80;
                                System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");

                                yen = amount / 0.63;
                                System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Renminbi");

                                ringgit = amount / 16;
                                System.out.println("Your " + amount + " Rupee is : " + f.format(ringgit) + " ringgit");
                            }
                                else
                                    throw new IllegalArgumentException(" enter valid number");
                            }
                            break;
                            case  2 : {
                                System.out.println("How much Money you want to convert ?");
                                amount = sc.nextFloat();
                                if(amount >=0){
                                rupee = amount * 70;
                                System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");

                                pound = amount * 0.78;
                                System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");

                                euro = amount * 0.87;
                                System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");

                                yen = amount * 111.087;
                                System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Renminbi");

                                ringgit = amount * 4.17;
                                System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " ringgit");
                            }
                                else
                                    throw new IllegalArgumentException(" enter valid number");
                            }
                            break;
                            case 3 :{
                                System.out.println("How much Money you want to convert ?");
                                amount = sc.nextFloat();
                                if(amount >=0) {
                                    rupee = amount * 88;
                                    System.out.println("Your " + amount + " pound is : " + f.format(rupee) + " Ruppes");

                                    dollar = amount * 1.26;
                                    System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");

                                    euro = amount * 1.10;
                                    System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");

                                    yen = amount * 140.93;
                                    System.out.println("Your " + amount + " pound is : " + f.format(yen) + " Renminbi");

                                    ringgit = amount * 5.29;
                                    System.out.println("Your " + amount + " pound is : " + f.format(ringgit) + " ringgit");
                                }
                                  else
                                    throw new IllegalArgumentException(" enter valid number");
                                }
                            case 4:
                                System.out.println("How much Money you want to convert ?");
                                amount = sc.nextFloat();
                                if(amount >=0) {
                                rupee = amount * 80;
                                System.out.println("Your " + amount + " euro is : " + f.format(rupee) + " Ruppes");

                                dollar = amount * 1.14;
                                System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");

                                pound = amount * 0.90;
                                System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");

                                yen = amount * 127.32;
                                System.out.println("Your " + amount + " euro is : " + f.format(yen) + " Renminbi");

                                ringgit = amount * 4.78;
                                System.out.println("Your " + amount + " euro is : " + f.format(ringgit) + " ringgit");
                                   }
                                else{
                                    throw new IllegalArgumentException(" enter valid number");
                                }
                                break;
                            case 5:System.out.println("How much Money you want to convert ?");
                                amount = sc.nextFloat();
                                if(amount >=0) {
                                rupee = amount * 0.63;
                                System.out.println("Your " + amount + " yen is : " + f.format(rupee) + " Ruppes");

                                dollar = amount * 0.008;
                                System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");

                                pound = amount * 0.007;
                                System.out.println("Your " + amount + " yen is : " + f.format(pound) + " Pound");

                                euro = amount * 0.007;
                                System.out.println("Your " + amount + " Renminbi is : " + f.format(euro) + " Renminbi");

                                ringgit = amount * 0.037;
                                System.out.println("Your " + amount + " yen is : " + f.format(ringgit) + " ringgit");
                                       }
                                else{
                                    throw new IllegalArgumentException(" enter valid number");
                                }
                                break;
                            case 6:
                                i=1;
                                break;
                            default:
                                System.out.println("Thank you for choosing our services");
                        }
                    } while (i == 0);


                }
            }