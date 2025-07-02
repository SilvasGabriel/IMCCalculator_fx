package imcc.imccalculator;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class IMCCalculator extends Application {

    @Override
    public void start(Stage stage){

        Label labelPeso = new Label("Peso: ");
        TextField pesoTextField= new TextField();
        pesoTextField.setPromptText("Peso em kilogramas");


        Label labelAltura = new Label("Altura: ");
        TextField alturaTextField = new TextField();
        alturaTextField.setPromptText("Altura em centimetros");


        Button calcularIMC = new Button("Calcular IMC");
        Label resultadoCalculoIMC = new Label();

        calcularIMC.setOnAction(actionEvent -> {

            try {

                double peso = Double.parseDouble(pesoTextField.getText().replace(',','.'));
                double altura = Double.parseDouble(alturaTextField.getText().replace(',','.'));

                double divideHundred = altura/100;
                double imc = ( peso / (divideHundred * divideHundred));

                resultadoCalculoIMC.setText(String.format("Seu percentual é: %.2f",imc));

            }catch (NumberFormatException e){

                resultadoCalculoIMC.setText("Por favor insira valores válidos para peso e altura.");

            }

        });

        VBox layout = new VBox(10,labelPeso,pesoTextField,labelAltura,alturaTextField,calcularIMC,resultadoCalculoIMC);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);
        layout.getStyleClass().add("layout");


        //Starting the initial Screen
        Scene scene = new Scene(layout,300,300);
        scene.getStylesheets().add("file:///C:/Users/gabri/IdeaProjects/IMCCalculator/src/main/java/imcc/imccalculator/IMCCStyles.css");

        stage.setTitle("IMCCalculator");

        stage.setScene(scene);

        stage.show();
    }



    public static void main(String[] args) {

        launch();

    }
}