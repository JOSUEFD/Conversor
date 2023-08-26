import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CurrencyConverterGUI extends Application {
    private CurrencyConverter usdConverter = new DollarConverter();
    private CurrencyConverter gbpConverter = new PoundConverter();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Currency Converter");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        Label amountLabel = new Label("Amount (MXN):");
        grid.add(amountLabel, 0, 0);

        TextField amountField = new TextField();
        grid.add(amountField, 1, 0);

        Label usdLabel = new Label("USD:");
        grid.add(usdLabel, 0, 1);

        Label gbpLabel = new Label("GBP:");
        grid.add(gbpLabel, 0, 2);

        Label usdResultLabel = new Label();
        grid.add(usdResultLabel, 1, 1);

        Label gbpResultLabel = new Label();
        grid.add(gbpResultLabel, 1, 2);

        Button convertButton = new Button("Convert");
        convertButton.setOnAction(event -> {
            try {
                double mxnAmount = Double.parseDouble(amountField.getText());
                double usdEquivalent = usdConverter.convertToMXN(mxnAmount);
                double gbpEquivalent = gbpConverter.convertToMXN(mxnAmount);

                usdResultLabel.setText(String.format("%.2f USD", usdEquivalent));
                gbpResultLabel.setText(String.format("%.2f GBP", gbpEquivalent));
            } catch (NumberFormatException e) {
                // Manejar error de entrada inválida
                usdResultLabel.setText("Invalid input");
                gbpResultLabel.setText("Invalid input");
            }
        });
        grid.add(convertButton, 0, 3, 2, 1);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
