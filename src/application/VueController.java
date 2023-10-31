package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VueController{

    @FXML
    private ImageView btnVelo1;

    @FXML
    private ImageView btnVelo2;
    
    @FXML
    private Image imageVelo1;
    
    @FXML
    private Image imageVelo2;
    
	@FXML
    private void onBtnVelo1(MouseEvent e) throws IOException {
		
		imageVelo1 = btnVelo1.getImage();
		
		Velo velo = new Velo ("Course","Rouge","Decathlon",imageVelo1,500.0,"Aucune","170cm");

		 FXMLLoader loader = new FXMLLoader(getClass().getResource("Vue2.fxml"));
		 Parent root = loader.load();
		 VueController2 vueController2 = loader.getController();
		 vueController2.afficherImage(imageVelo1);
		 vueController2.afficherInformationVelo(velo);

		 Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		 Scene scene2 = new Scene(root);
		 stage.setScene(scene2);
		 stage.show();      
    }

    @FXML
    private void onBtnVelo2(MouseEvent e) throws IOException {	
    	
    	imageVelo2 = btnVelo2.getImage();
    	
		Velo velo = new Velo ("Ville","Rouge","Decathlon",imageVelo2,650.0,"Aucune","170cm");
    	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Vue2.fxml"));
		Parent root = loader.load();
		VueController2 vueController2 = loader.getController();
		vueController2.afficherImage(imageVelo2);
		vueController2.afficherInformationVelo(velo);

		Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		Scene scene2 = new Scene(root);
		stage.setScene(scene2);
		stage.show();
    }
    
}

