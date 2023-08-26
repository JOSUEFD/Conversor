# Currency Converter with JavaFX

This is a simple currency converter program implemented in Java using the JavaFX library. The program allows you to convert amounts between Mexican Pesos (MXN) and various other currencies including USD and GBP. It also provides the option to perform reverse conversions.

## Prerequisites

- Java Development Kit (JDK) 11 or later
- Eclipse IDE (or any other Java IDE)

## Getting Started

1. Clone this repository to your local machine or download the ZIP file.
2. Open Eclipse IDE.
3. Import the project:
   - File > Import > General > Existing Projects into Workspace
4. Configure JavaFX:
   - Right-click on your project in the Project Explorer.
   - Choose Build Path > Configure Build Path.
   - Add the JavaFX libraries to your project's build path.
5. Set up JavaFX VM arguments:
   - Right-click on your main class (CurrencyConverterGUI.java) and choose Run As > Run Configurations.
   - In the "Arguments" tab, under "VM arguments," add the appropriate JavaFX module-path and modules (see example in previous messages).
   - Apply and close the configuration.
6. Run the application:
   - Right-click on your main class (CurrencyConverterGUI.java) and choose Run As > Java Application.

## Usage

1. Enter the amount in Mexican Pesos (MXN) that you want to convert in the provided text field.
2. Click the "Convert" button to perform the currency conversions.
3. The equivalent amounts in USD and GBP will be displayed on the screen.
4. To perform reverse conversions, enter the amount in USD or GBP, and click the "Convert" button.

## Notes

- This program uses fictional conversion rates for demonstration purposes. In a real-world scenario, you would need to fetch updated exchange rates from a reliable source.
- This README provides a basic overview. Customize it to include any additional information relevant to your project.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
