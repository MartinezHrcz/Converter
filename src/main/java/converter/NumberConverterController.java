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
    private TextField octalNum;

    @FXML
    private void initialize() {
        decimalNum.textProperty().bindBidirectional(binaryNum.textProperty(),
                new NumberSystemConverter(10,2));
    }
}
