package it.unisa.se.team02.Application;

import it.unisa.se.team02.Operation.VarEvent;
import it.unisa.se.team02.Alert.ShowInformation;
import it.unisa.se.team02.ButtonAction.ButtonFactory;
import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import it.unisa.se.team02.ComplexNumber.*;
import it.unisa.se.team02.FunctionStoreLoad.ContextFunction;
import it.unisa.se.team02.FunctionStoreLoad.LoadFunctions;
import it.unisa.se.team02.FunctionStoreLoad.SaveFunctions;
import it.unisa.se.team02.ObservableStack.MemoryStack;
import it.unisa.se.team02.Operation.Azione;
import it.unisa.se.team02.Operation.Menu;
import it.unisa.se.team02.Operation.Operation;
import it.unisa.se.team02.Operation.OperatorFactory;
import it.unisa.se.team02.Operation.SimbolClass;
import it.unisa.se.team02.Operation.UserFunction;
import it.unisa.se.team02.StateCalculator.ContextCalculator;
import it.unisa.se.team02.StateCalculator.NormalState;
import it.unisa.se.team02.StateCalculator.PowState;
import it.unisa.se.team02.VariablesActions.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Stack;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * This class allows you to interact with the application interface by capturing
 * user actions
 *
 * @version n.n (gg-mm-aaaa)
 * @author Team02
 */
public class Controller implements Initializable {

    private final byte characterAMinChar = 97;
    private final byte alphabetLenght = 26;
    @FXML
    private AnchorPane rootPane;
    //This label allows you to view complex input numbers
    @FXML
    private Label inputText;

    //Lista che contiene i numeri complessi dello stack 
    @FXML
    private ListView<CartesianComplex> mainList;
    private ObservableStack<CartesianComplex> stack;

    //Menu che ha al suo interno la lista dei comandi da eseguire in quel momento
    private Menu menu;

    //Mappa che associa la variabile al rispettivo valore complesso EX -> >a
    private ObservableMap<Character, CartesianComplex> map;

    //Numero corrente
    private String currentNumber = "";
    //Comando corrente
    private List<String> currentSign;
    private ButtonFactory button;

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

    //List containing the values of the variables
    @FXML
    private ListView<VarEvent> variableList;
    //Lista osservabile che ha i valori delle variabili
    private ObservableList<VarEvent> events;

    //Buttons that activate operations on variables 
    @FXML
    private Button subVar;
    @FXML
    private Button greater;
    @FXML
    private Button minor;
    @FXML
    private Button sumVar;

    //Buttons that activate stack operations
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

    //Table that saves the name and command list of the function
    @FXML
    private TableView<UserFunction> tableFunc;
    @FXML
    private TableColumn<UserFunction, String> nameCln;
    @FXML
    private TableColumn<UserFunction, String> commandCln;

    private ObservableList<UserFunction> functionK;
    private Map<String, UserFunction> mapFunc;

    @FXML
    private Button loadFunc;
    @FXML
    private Button saveFunc;
    @FXML
    private TextField nameFunc;

    //Buttons that enable trigonometric operations
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

    //Buttons that enable normal operations 
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

    //Buttons for saving and restoring variables
    @FXML
    private Button saveVariables;
    @FXML
    private Button restoreCommand;

    private OperatorFactory opFactory;
    private SimbolClass simbol;
    private ContextFunction context;
    private MapChangeListener<Button, CartesianComplex> listener = null;
    private Stack<MemoryStack> stackVar;
    private String powNumber = "";
    private String currentFunction;
    private ContextCalculator contextCalculator;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stack = new ObservableStack<>();
        menu = new Menu();
        mapFunc = new HashMap<>();
        opFactory = new OperatorFactory();
        simbol = new SimbolClass();
        currentSign = new ArrayList<>();
        button = new ButtonFactory();
        stackVar = new Stack<>();
        nameCln.setCellValueFactory(new PropertyValueFactory<UserFunction, String>("name"));
        commandCln.setCellValueFactory(new PropertyValueFactory<UserFunction, String>("funzione"));
        contextCalculator = new ContextCalculator();
        contextCalculator.setState(new NormalState());
        functionK = FXCollections.observableArrayList();
        map = FXCollections.observableHashMap();
        events = FXCollections.observableArrayList();

        inizialize();

        variableList.setItems(events);
        mainList.setItems(stack);
        tableFunc.setItems(functionK);

    }

    private void inizialize() {
        for (int i = 0; i < alphabetLenght; i++) {
            events.add(new VarEvent((char) (characterAMinChar + i), new CartesianComplex(0, 0)));
        }
    }

    // This method allows you to enter the complex number by clicking on the button
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Button source = (Button) event.getSource();
        String s = button.getCharacter(source.getId(), currentNumber);
        if (s != null) {
            if (contextCalculator.getState().getClass().isInstance(new PowState())) {
                contextCalculator.getState().doAction(currentSign, s);
                powNumber += s;
                updateOutputSign();
            } else {
                addChar(s);
            }
        } else {
            deleteAll();
        }
    }

    private void deleteAll() {
        currentNumber = "";
        updateTextField();
    }

    // This method allows you to capture alphanumeric buttons
    @FXML
    private void handleVariablesCommand(ActionEvent event) {
        Button source = (Button) event.getSource();
        if (source == saveVariables) {
            stackVar.push(new MemoryStack(new HashMap<>(map)));
        }
        if (source == restoreCommand) {

            if (stackVar.size() == 0) {
                info = new ShowInformation(Alert.AlertType.ERROR, "Operation Error",
                        "No configuration saved", "");
                info.showAlert();
            }
            map.clear();
            map.putAll(stackVar.pop().getMappa());
            ResetList();
        }
    }

    private void ResetList() {
        for (Map.Entry<Character, CartesianComplex> entry : map.entrySet()) {
            events.set((int) (entry.getKey()) - 97, new VarEvent(entry.getKey(), entry.getValue()));
        }
    }

    // This method allows you to create complex operation
    @FXML
    private void handleOperationCommand(ActionEvent event) {
        Button source = (Button) event.getSource();
        currentSign.add(simbol.getSimbol(source.getId()));
        updateOutputSign();
        opFactory.setOperation(source.getId(), menu);
    }

    // This method allows you to create Function complex operation
    @FXML
    private void handleFunctionCommand(ActionEvent event) {
        Button source = (Button) event.getSource();
        if (source == loadFunc) {
            context = new ContextFunction(new LoadFunctions());
            context.executeStrategy(functionK, rootPane);
            for (UserFunction user : functionK) {
                mapFunc.put(user.getName(), user);
            }
        } else {
            context = new ContextFunction(new SaveFunctions());
            context.executeStrategy(functionK, rootPane);
        }
    }

    // This method allows you to perform all Trigonometric complex operation
    @FXML
    private void handleTrigonometricCommand(ActionEvent event) {
        Button source = (Button) event.getSource();
        currentSign.add(source.getId());
        updateOutputSign();
        if (source == pow) {
            contextCalculator = new ContextCalculator();
            contextCalculator.setState(new PowState());
            opFactory.setOperation(source.getId(), menu);
        } else {

            opFactory.setOperation(source.getId(), menu);
        }
    }

    @FXML
    private void deleteOperationSign(ActionEvent event) {
        menu.removeAction();
        currentSign.remove(currentSign.size() - 1);
        updateOutputSign();

    }

    // This method allows you to perform all VariableAction operation.
    @FXML
    private void handleVariablesAction(ActionEvent event) {
        Button source = (Button) event.getSource();
        currentSign.add(source.getId());
        updateOutputSign();
        opFactory.setOperationVariables(source.getId(), menu);
    }

    /*
      The push method creates a ComplexNumber starting from the string inserted
      in input via the interface, stored in the variable "currentNumber". It
      then adds the new ComplexNumber to the Stack and calls the refresh ()
      method. Return Void.
     */
    @FXML
    private void push(ActionEvent event) {
        if (checkValue(currentNumber)) {
            Complex complex = currentNumber.contains(",")
                    ? ComplexFactory.createComplex(ComplexType.CARTESIAN, Double.valueOf(currentNumber.split(",")[0]), Double.valueOf(currentNumber.split(",")[1]))
                    : ComplexFactory.createComplex(ComplexType.CARTESIAN, Double.valueOf(currentNumber), Double.valueOf("0"));
            stack.push((CartesianComplex) complex);
            refresh(); //formatto l'inputText
        } else {
            info = new ShowInformation(Alert.AlertType.ERROR, "Insertion error",
                    "Please consider this insert example", "x\n-x\nx,x\n-x,x\nx,-x\n-x,-x");
            info.showAlert();
            deleteAll();
        }

    }

    // This method allows the deletion of a character or number from the inpuText, updating the current number
    @FXML
    private void delete(ActionEvent event) {
        currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
        updateTextField();
    }

    // This method allows to close the application
    @FXML
    private void quitApplication(ActionEvent event) {
        Platform.exit();
    }

    // This method allows you to delete the function created
    @FXML
    private void deleteFunc(ActionEvent event) {
        String s = tableFunc.getSelectionModel().getSelectedItem().getName();
        functionK.remove(mapFunc.remove(s));
        currentSign.clear();
        updateOutputSign();
    }

    // This method allows you to see the function created
    @FXML
    private void viewFunc(MouseEvent event) {
        currentSign.clear();
        updateOutputSign();
        menu.reset();
        UserFunction uf = tableFunc.getSelectionModel().getSelectedItem();
        uf.getCodice().forEach(a -> {
            menu.getList().add(a);
        });
        nameFunc.setText(uf.getName());
        outputSign.setText(uf.getFunzione());
        updateSign(uf);
        updateOutputSign();
        currentFunction = uf.getName();
    }

    // This method allows you to modify the function created by creating a new function
    @FXML
    private void modifyFunc(ActionEvent event) {
        if (!nameFunc.getText().isEmpty()) {
            UserFunction uf = mapFunc.get(currentFunction);
            functionK.remove(uf);
            mapFunc.remove(currentFunction);
            uf.setName(nameFunc.getText());
            uf.getCodice().clear();
            uf.setActions(menu);
            uf.setFunzione(outputSign.getText());
            mapFunc.put(nameFunc.getText(), uf);
            functionK.add(uf);
            executeClearSignText();
        }
    }

    private void executeClearSignText() {
        currentSign.clear();
        updateOutputSign();
        nameFunc.setText("");
    }

    // This method allows you to create a new function complex
    @FXML
    private void createFunc(ActionEvent event) {
        if (!nameFunc.getText().isEmpty() && !outputSign.getText().isEmpty()) {
            UserFunction uf = new UserFunction(nameFunc.getText(), outputSign.getText());
            uf.setActions(menu);
            mapFunc.put(uf.getName(), uf);
            functionK.add(uf);

            executeClearSignText();
            menu.reset();
        }
    }

    // This method extracts the next action from the menu, executes it and update the currentSign.
    private void supportExecute() {
        Azione azione = menu.takeAction();
        Operation operation = azione.getCommand();
        if (operation instanceof Greater
                || operation instanceof Minor
                || operation instanceof SubVar
                || operation instanceof SumVar) {
            char y = operation.executeVariable(stack, map, menu);
            events.set((int) (y) - 97, new VarEvent(y, map.get(y)));
            currentSign.remove(0);
            currentSign.remove(0);
        } else {
            if (contextCalculator.getState().getClass().isInstance(new PowState())) {
                operation.doOperation(stack, Integer.parseInt(powNumber));
                contextCalculator.setState(new NormalState());
                for (int i = 0; i < powNumber.length(); i++) {
                    currentSign.remove(0);
                }
                powNumber = "";
            }
            operation.doOperation(stack);
            currentSign.remove(0);
        }
        updateOutputSign();
    }

    // This method allows you to execute a function complex
    @FXML
    private void execute(ActionEvent event) {
        if (nameFunc.getText().compareTo("") == 0) {
            supportExecute();
        } else {//parte funzoioni
            while (menu.getList().size() != 0) {
                supportExecute();
            }
            currentSign.clear();
            nameFunc.setText("");
        }
    }

    // This method allows to understand if the entered text is correct
    private boolean checkValue(String s) {
        return s.contains(",") && s.chars().filter(ch -> ch == ',').count() == 1 ? s.matches("-?[0-9]*.?[0-9]+,{1}-?[0-9]*.?[0-9]+") : s.matches("-?[0-9]*.?[0-9]+");
    }

    //This method concatenates the correct number and updates the input text
    private void addChar(String character) {
        currentNumber += character;
        updateTextField();
    }

    // The refresh method initializes the variable "currentNumber" and calls the updateTextField() method. 
    private void refresh() {
        currentNumber = "";
        updateTextField();
    }

    // The updateTextField method sets the content of the variable
    // "currentNumber" in the input area of ​​the interface. Return Void.
    private void updateTextField() {
        inputText.setText(currentNumber);
    }

    // This method sets the content of the variable "currentSign" in the outputSign area of ​​the interface.
    private void updateOutputSign() {
        String s = "";
        for (String g : currentSign) {
            s += g + " ";
        }
        outputSign.setText(s);
    }

    // This method sets the contents of the attribute "Codice" of the UserFunction object in the variable "currentSign".
    private void updateSign(UserFunction uf) {
        for (Azione listAction : uf.getCodice()) {
            if (listAction.getOp().matches("[a-z]")) {
                currentSign.add(listAction.getOp());
            } else {
                currentSign.add(simbol.getSimbol(listAction.getOp()));
            }
        }
    }
}
