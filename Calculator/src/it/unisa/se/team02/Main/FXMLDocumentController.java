package it.unisa.se.team02.Main;

import it.unisa.se.team02.Alert.ShowInformation;
import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import it.unisa.se.team02.ComplexNumber.*;
import it.unisa.se.team02.Operation.Azione;
import it.unisa.se.team02.Operation.Menu;
import it.unisa.se.team02.Operation.OperatorFactory;
import it.unisa.se.team02.Operation.SimbolClass;
import it.unisa.se.team02.Operation.UserFunction;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * This class allows you to interact with the application interface by capturing
 * user actions
 *
 * @version n.n (gg-mm-aaaa)
 * @author Team02
 */
public class FXMLDocumentController implements Initializable {

    private final byte characterAMinChar = 97;
    private final byte alphabetLenght = 26;

    //This label allows you to view complex input numbers
    @FXML
    private Label inputText;
    //This label allows you to view complex output numbers
    @FXML
    private Label outputText;

    //Lista che contiene i numeri complessi dello stack 
    @FXML
    private ListView<CartesianComplex> mainList;
    private ObservableStack<CartesianComplex> stack;

    //Menu che ha al suo interno la lista dei comandi da eseguire in quel momento
    private Menu menu;

    //Mappa che associa la variabile al rispettivo valore complesso EX -> >a
    private ObservableMap<Button, CartesianComplex> map;

    //Numero corrente
    private String currentNumber = "";
    //Comando corrente
    private List<String> currentSign;;

    //CLasse che mostra gli allert
    private ShowInformation info;

    //This label allows you to view commands to execute on complex values
    @FXML
    private Label outputSign;

    //Variables
    @FXML
    private Button z;
    @FXML
    private Button m;
    @FXML
    private Button y;
    @FXML
    private Button x;
    @FXML
    private Button w;
    @FXML
    private Button l;
    @FXML
    private Button k;
    @FXML
    private Button j;
    @FXML
    private Button v;
    @FXML
    private Button i;
    @FXML
    private Button u;
    @FXML
    private Button h;
    @FXML
    private Button t;
    @FXML
    private Button g;
    @FXML
    private Button s;
    @FXML
    private Button r;
    @FXML
    private Button f;
    @FXML
    private Button e;
    @FXML
    private Button q;
    @FXML
    private Button d;
    @FXML
    private Button p;
    @FXML
    private Button o;
    @FXML
    private Button n;
    @FXML
    private Button c;
    @FXML
    private Button b;
    @FXML
    private Button a;

    //Buttons
    @FXML
    private Button four;
    @FXML
    private Button nine;
    @FXML
    private Button eight;
    @FXML
    private Button seven;
    @FXML
    private Button zero;
    @FXML
    private Button sign;
    @FXML
    private Button three;
    @FXML
    private Button two;
    @FXML
    private Button one;
    @FXML
    private Button six;
    @FXML
    private Button five;
    @FXML
    private Button dot;
    @FXML
    private Button comma;
    //Lista che contiene i valori delle variabili
    @FXML
    private ListView<VarEvent> variableList;
    //Lista osservabile che ha i valori delle variabili
    private ObservableList<VarEvent> events;

    //Bottoni che lavorano sulle variabili
    @FXML
    private Button subVar;
    @FXML
    private Button greater;
    @FXML
    private Button minor;
    @FXML
    private Button sumVar;

    //BOttoni che lavorano sui valori dello stack
    @FXML
    private Button drop;
    @FXML
    private Button over;
    @FXML
    private Button dup;
    @FXML
    private Button swap;
    @FXML
    private Button clear;

    //Tabella che salva il nome e la lista di comandi della funzione
    @FXML
    private TableView<?> tableFunc;
    @FXML
    private TableColumn<?, ?> nameCln;
    @FXML
    private TableColumn<?, ?> commandCln;
    @FXML
    private Button loadFunc;
    @FXML
    private Button saveFunc;
    @FXML
    private TextField nameFunc;

    //bottoni che abilitano le operazioni trigonometriche
    @FXML
    private Button pow;
    @FXML
    private Button atan;
    @FXML
    private Button acos;
    @FXML
    private Button asin;
    @FXML
    private Button log;
    @FXML
    private Button mod;
    @FXML
    private Button arg;
    @FXML
    private Button exp;
    @FXML
    private Button cos;
    @FXML
    private Button sin;
    @FXML
    private Button tan;

    //bottoni che abilitano le operazioni classiche 
    @FXML
    private Button multi;
    @FXML
    private Button sub;
    @FXML
    private Button division;
    @FXML
    private Button inverterSign;
    @FXML
    private Button add;
    @FXML
    private Button sqrt;

    //Bottoni di salvataggio e ripristino delle variabili
    @FXML
    private Button saveVariables;
    @FXML
    private Button restoreCommand;
    
    //Classi creazionni metodi, simoli, bottoni
    OperatorFactory opFactory;
    SimbolClass simbol;

    private Button Btn;
    private MapChangeListener<Button, CartesianComplex> listener = null;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stack = new ObservableStack<>();
        menu = new Menu();

        map = FXCollections.observableHashMap();
        events = FXCollections.observableArrayList();
        
        inizialize();
        
        variableList.setItems(events);
        mainList.setItems(stack);

        listener = new MapChangeListener<Button, CartesianComplex>() {
            @Override
            public void onChanged(MapChangeListener.Change<? extends Button, ? extends CartesianComplex> ch) {
                System.out.println("Map update");
                events.set((int) (Btn.getId().charAt(0)) - characterAMinChar, new VarEvent(Btn.getId().charAt(0), map.get(Btn)));
                outputText.setText(Btn.getId() + ":" + map.get(Btn));

            }
        };
        map.addListener(listener);
    }

    private void inizialize() {
        for (int i = 0; i < alphabetLenght; i++) {
            events.add(new VarEvent((char) (characterAMinChar + i), new CartesianComplex(0, 0)));
        }
    }

    /**
     * This method allows you to enter the complex number by clicking on the
     * button
     *
     * @param event
     */
    @FXML
    private void handleButtonAction(ActionEvent event) {

    }

    /**
     * This method allows you to capture alphanumeric buttons
     *
     * @param event
     */
    @FXML
    private void handleVariablesCommand(ActionEvent event) {
    }

    /**
     * This method allows you to create complex operation
     *
     * @param event
     */
    @FXML
    private void handleOperationCommand(ActionEvent event) {
        Button source = (Button) event.getSource();
        currentSign.add(simbol.getSimbol(source.getId()));
        updateOutputSign();
        opFactory.setOperation(source.getId(), menu);
    }

    /**
     * This method allows you to create Function complex operation
     *
     * @param event
     */
    @FXML
    private void handleFunctionCommand(ActionEvent event) {
    }

    /**
     * This method allows you to perform all Trigonometric complex operation
     *
     * @param event
     */
    @FXML
    private void handleTrigonometricCommand(ActionEvent event) {
    }

    @FXML
    private void deleteOperationSign(ActionEvent event) {
        menu.removeAction();
        currentSign.remove(currentSign.size() - 1);
        updateOutputSign();

    }

    /**
     *
     * @param event
     */
    @FXML
    private void handleVariablesAction(ActionEvent event) {
        //to modify
    }

    /**
     * The push method creates a ComplexNumber starting from the string inserted
     * in input via the interface, stored in the variable "currentNumber". It
     * then adds the new ComplexNumber to the Stack and calls the refresh ()
     * method. Return Void.
     *
     * @param event
     */
    @FXML
    private void push(ActionEvent event) {
        if (checkInput(currentNumber)) {
            Complex complex = currentNumber.contains(",")
                    ? ComplexFactory.createComplex(ComplexType.CARTESIAN, Double.valueOf(currentNumber.split(",")[0]), Double.valueOf(currentNumber.split(",")[1]))
                    : ComplexFactory.createComplex(ComplexType.CARTESIAN, Double.valueOf(currentNumber), Double.valueOf("0"));
            stack.push((CartesianComplex) complex);
            refresh(); //formatto l'inputText
        } else {
            info = new ShowInformation(Alert.AlertType.ERROR, "Insertion error",
                    "Please consider this insert example", "x\n-x\nx,x\n-x,x\nx,-x\n-x,-x");
            info.showAlert();
        }

    }

    /**
     * This method allows the deletion of a character or number from the
     * inpuText, updating the current number
     *
     * @param event
     */
    @FXML
    private void delete(ActionEvent event) {
        currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
        updateTextField();
    }

    /**
     * This method allows to close the application
     *
     * @param event
     */
    @FXML
    private void quitApplication(ActionEvent event) {
        Platform.exit();
    }

    /**
     * This method allows you to delete the function created
     *
     * @param event
     */
    @FXML
    private void deleteFunc(ActionEvent event) {
    }

    /**
     * This method allows you to see the function created
     *
     * @param event
     */
    @FXML
    private void viewFunc(MouseEvent event) {
    }

    /**
     * This method allows you to modify the function created by creating a new
     * function
     *
     * @param event
     */
    @FXML
    private void modifyFunc(ActionEvent event) {
    }

    /**
     * This method allows you to create a new function complex
     *
     * @param event
     */
    @FXML
    private void createFunc(ActionEvent event) {
    }

    /**
     * This method allows you to execute a function complex
     *
     * @param event
     */
    @FXML
    private void execute(ActionEvent event) {
    }

    /**
     * This method allows to understand if the entered text is correct
     *
     * @param s String
     * @return a boolean type
     */
    private boolean checkInput(String s) {
        return s.contains(",") && s.chars().filter(ch -> ch == ',').count() == 1 ? s.matches("-?[0-9]*.?[0-9]+,{1}-?[0-9]*.?[0-9]+") : s.matches("-?[0-9]*.?[0-9]+");
    }

    /**
     * This method concatenates the correct number and updates the input text
     *
     * @param character number or character that is captured by the user
     */
    public void addChar(String character) {
        currentNumber += character;
        updateTextField();
    }

    /**
     * The refresh method initializes the variable "currentNumber" and calls the
     * updateTextField() method. Return Void.
     *
     * @see updateTextField
     */
    private void refresh() {
        currentNumber = "";
        updateTextField();
    }

    /**
     * The updateTextField method sets the content of the variable
     * "currentNumber" in the input area of ​​the interface. Return Void.
     */
    public void updateTextField() {
        inputText.setText(currentNumber);
    }

    /**
     * This method updates the output text with the result of an operation
     *
     * @param complex this parameter contains the result of the operation and is
     * a complex number
     */
    public void setResult(CartesianComplex complex) {
        outputText.setText(complex.toString());
    }

    private void updateOutputSign() {
        String s = "";
        for (String g : currentSign) {
            s += g + " ";
        }
        outputSign.setText(s);
    }

}
