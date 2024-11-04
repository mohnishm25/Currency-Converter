import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;
import java.util.Scanner;


public class App {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/76f7571bcb620981772737ba/latest/";

    public static double getExchangeRate(String fromCurrency, String toCurrency) throws Exception {
        String url = API_URL + fromCurrency;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        //used to send requests and recieve those responses
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //System.out.println("Response: "+ response.body());

        JSONObject jsonResponse = new JSONObject(response.body());
        JSONObject rates = jsonResponse.getJSONObject("conversion_rates");
        //Storing and exchanging data

        return rates.getDouble(toCurrency);
    }
    public static void main(String[] args) throws Exception {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a amount you would like to convert.");
            int inputamount = input.nextInt();
            String fromCurrency = Capstone_Currency_from();
            String toCurrency = Capstone_Currency_to();
            double exchangeRate = getExchangeRate(fromCurrency, toCurrency);
            double convertedAmount = inputamount * exchangeRate;
            System.out.println(inputamount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }}
        public static String Capstone_Currency_from(){
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the Currency Convertor!");
            System.out.println("Choose the currency you would like to convert from.");
            System.out.println("1. US Dollar");
            System.out.println("2. European Euro");
            System.out.println("3. Japanese Yen");
            System.out.println("4. Pound Sterling");
            System.out.println("5. Australian Dollar");
            System.out.println("6. Canadian Dollar");
            System.out.println("7. Swiss franc");
            System.out.println("8. Chinese Yuan Renminbi");
            System.out.println("9. Swedish Krona");
            System.out.println("10. Mexican Peso");
            System.out.println("11. New Zealand Dollar");
            System.out.println("12. Singapore Dollar");
            System.out.println("13. Hong Kong Dollar");
            System.out.println("14. Norwegian Krone");
            System.out.println("15. South Korean Won");
            System.out.println("16. Turkish Lira");
            System.out.println("17. Indian rupee");
            System.out.println("18. Russian Ruble");
            System.out.println("19. Brazilian Real");
            System.out.println("20. South African Rand");
            System.out.println("Currency Chosen: ");
            int inputcurr = input.nextInt();
            String fromcurrency = "USD";
            if(inputcurr==1){
                fromcurrency = "USD";
            }
            else if(inputcurr==2){
                fromcurrency = "EUR";
            }
            else if(inputcurr==3){
                fromcurrency = "JPY";
            }
            else if(inputcurr==4){
                fromcurrency = "GBP";
            }
            else if(inputcurr==5){
                fromcurrency = "AUD";
            }
            else if(inputcurr==6){
                fromcurrency = "CAD";
            }
            else if(inputcurr==7){
                fromcurrency = "CHF";
            }
            else if(inputcurr==8){
                fromcurrency = "CNY";
            }
            else if(inputcurr==9){
                fromcurrency = "SEK";
            }
            else if(inputcurr==10){
                fromcurrency = "MXN";
            }
            else if(inputcurr==11){
                fromcurrency = "NZD";
            }
            else if(inputcurr==12){
                fromcurrency = "SGD";
            }
            else if(inputcurr==13){
                fromcurrency = "HKD";
            }
            else if(inputcurr==14){
                fromcurrency = "NOK";
            }
            else if(inputcurr==15){
                fromcurrency = "KRW";
            }
            else if(inputcurr==16){
                fromcurrency = "TRY";
            }
            else if(inputcurr==17){
                fromcurrency = "INR";
            }
            else if(inputcurr==18){
                fromcurrency = "RUB";
            }
            else if(inputcurr==19){
                fromcurrency = "BRL";
            }
            else if(inputcurr==20){
                fromcurrency = "ZAR";
            }
            return fromcurrency;  
        }  
            
            public static String Capstone_Currency_to(){
                Scanner input = new Scanner(System.in);
                System.out.println("Welcome to the Currency Convertor!");
                System.out.println("Choose the currency you would like to convert from.");
                System.out.println("1. US Dollar");
                System.out.println("2. European Euro");
                System.out.println("3. Japanese Yen");
                System.out.println("4. Pound Sterling");
                System.out.println("5. Australian Dollar");
                System.out.println("6. Canadian Dollar");
                System.out.println("7. Swiss franc");
                System.out.println("8. Chinese Yuan Renminbi");
                System.out.println("9. Swedish Krona");
                System.out.println("10. Mexican Peso");
                System.out.println("11. New Zealand Dollar");
                System.out.println("12. Singapore Dollar");
                System.out.println("13. Hong Kong Dollar");
                System.out.println("14. Norwegian Krone");
                System.out.println("15. South Korean Won");
                System.out.println("16. Turkish Lira");
                System.out.println("17. Indian Rupee");
                System.out.println("18. Russian Ruble");
                System.out.println("19. Brazilian Real");
                System.out.println("20. South African Rand");
                System.out.println("Currency Chosen: ");
                int inputcurr = input.nextInt();
                String tocurrency = "USD";
                if(inputcurr==1){
                    tocurrency = "USD";
                }
                else if(inputcurr==2){
                    tocurrency = "EUR";
                }
                else if(inputcurr==3){
                    tocurrency = "JPY";
                }
                else if(inputcurr==4){
                    tocurrency = "GBP";
                }
                else if(inputcurr==5){
                    tocurrency = "AUD";
                }
                else if(inputcurr==6){
                    tocurrency = "CAD";
                }
                else if(inputcurr==7){
                    tocurrency = "CHF";
                }
                else if(inputcurr==8){
                    tocurrency = "CNY";
                }
                else if(inputcurr==9){
                    tocurrency = "SEK";
                }
                else if(inputcurr==10){
                    tocurrency = "MXN";
                }
                else if(inputcurr==11){
                    tocurrency = "NZD";
                }
                else if(inputcurr==12){
                    tocurrency = "SGD";
                }
                else if(inputcurr==13){
                    tocurrency = "HKD";
                }
                else if(inputcurr==14){
                    tocurrency = "NOK";
                }
                else if(inputcurr==15){
                    tocurrency = "KRW";
                }
                else if(inputcurr==16){
                    tocurrency = "TRY";
                }
                else if(inputcurr==17){
                    tocurrency = "INR";
                }
                else if(inputcurr==18){
                    tocurrency = "RUB";
                }
                else if(inputcurr==19){
                    tocurrency = "BRL";
                }
                else if(inputcurr==20){
                    tocurrency = "ZAR";
                }
                return tocurrency;    
        }
    }
