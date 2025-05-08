package converter;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NumberConverterController {
    @FXML
    private TextField decimalNum;
    @FXML
    private TextField binaryNum;
    @FXML
    private TextField hexaNum;
    @FXML
    private TextField octaNum;

    @FXML
    private void initialize() {
        //From decimal to other number bi directionally
        decimalNum.textProperty().bindBidirectional(binaryNum.textProperty(),
                new NumberSystemConverter(10,2));

        decimalNum.textProperty().bindBidirectional(hexaNum.textProperty(),
                new NumberSystemConverter(10,16));

        decimalNum.textProperty().bindBidirectional(octaNum.textProperty(),
                new NumberSystemConverter(10,8));
    }
}
