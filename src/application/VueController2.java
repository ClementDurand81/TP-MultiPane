package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class VueController2 {
    @FXML
    private ImageView imgVeloView2;
    
    @FXML
    private Label lblPrix;
    
    @FXML
    private Label lblPrix1;
    
    @FXML
    private Circle btnBleu1;
    
    @FXML
    private Circle btnRouge1;
    
    @FXML
    private Circle btnBlanc1;
    
    @FXML
    private Circle btnVert1;
    
    @FXML
    private Circle btnVert2;
    
    @FXML
    private Circle btnBlanc2;
    
    @FXML
    private Circle btnBlanc3;
    
    @FXML
    private Circle btnNoir1;
    
    @FXML
    private Circle btnNoir2;
    
    @FXML
    private Circle btnViolet1;
    
    @FXML
    private Circle btnViolet2;

    private Options optionRouge;
    private Options optionBleu;
    private Options optionBlanc1;
    private Options optionNoir1;
    private Options optionNoir2;
    private Options optionBlanc2;
    private Options optionVert1;
    private Options optionVert2;
    private Options optionBlanc3;
    private Options optionViolet1;
    private Options optionViolet2;
    
    private Options selectedOption = null;

    private Velo velo;
    
    public void afficherImage(Image image) {
        if (image != null) {
            imgVeloView2.setImage(image);
        }
    }
    
    public void afficherInformationVelo(Velo velo) {
        this.velo = velo;
        updatePrix();
    }
    
    public void initialize() {
        optionRouge = new Options("Rouge", 150);
        optionBleu = new Options("Bleu", 100);
        optionBlanc1 = new Options("Blanc", 75);
        optionBlanc2 = new Options("Blanc", 175);
        optionBlanc3 = new Options("Blanc", 205);
        optionNoir1 = new Options("Noir", 115);
        optionNoir2 = new Options("Noir", 635);
        optionVert1 = new Options("Vert", 125);
        optionVert2 = new Options("Vert", 45);
        optionViolet1 = new Options("Violet", 35);
        optionViolet2 = new Options("Violet", 275);
        
        

        btnRouge1.setUserData(optionRouge);
        btnBleu1.setUserData(optionBleu);
        btnBlanc1.setUserData(optionBlanc1);
        btnBlanc2.setUserData(optionBlanc2);
        btnBlanc3.setUserData(optionBlanc3);
        btnNoir1.setUserData(optionNoir1);
        btnNoir2.setUserData(optionNoir2);
        btnVert1.setUserData(optionVert1);
        btnVert2.setUserData(optionVert2);
        btnViolet1.setUserData(optionViolet1);
        btnViolet2.setUserData(optionViolet2);
    }
    
    public void setSelectedOption(Options option) {
        this.selectedOption = option;
        updatePrix();
    }

    private void updatePrix() {
        if (velo != null) {
            double prixTotal = velo.getPrix();

            if (selectedOption != null) {
                prixTotal += selectedOption.getValeur();
            }

            lblPrix.setText("Prix : " + velo.getPrix() + " €");
            lblPrix1.setText("Prix avec options :" + prixTotal + "€");
        }
    }

    @FXML
    private void onOptionButtonClicked(MouseEvent event) {
        Circle circle = (Circle) event.getSource();
        Options option = (Options) circle.getUserData();
        setSelectedOption(option);
    }
    
    @FXML
    private void onRetourButtonClicked(MouseEvent event) throws IOException {
   
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Vue.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
