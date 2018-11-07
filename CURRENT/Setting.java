import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
/**
 * 
 * @author CHRIS G. I MADE THIS
 *
 */
public class Setting extends GridPane  {

	//Sting lists for the combo boxes
	ObservableList<String> options = 
			FXCollections.observableArrayList(
					"Holly Hill",
					"Port Orange",
					"Daytona",
					"Deland",
					"Ormond Beach"
					);
	ObservableList<String> yesno = 
			FXCollections.observableArrayList(
					"Yes",
					"No",
					"Prefer not to answer"
					);
	ObservableList<String> optionn = 
			FXCollections.observableArrayList(
					"Male",
					"Female",
					"Other"
					);

	//combo box declarations
	ComboBox<String> genderPref = new ComboBox<String>(optionn);
    ComboBox<String> genderIden = new ComboBox<String>(optionn);
    ComboBox<String> comboBox = new ComboBox<String>(options);
    ComboBox<String> dogBox = new ComboBox<String>(yesno);
    ComboBox<String> dogHaveBox = new ComboBox<String>(yesno);
    ComboBox<String> vegetarianBox = new ComboBox<String>(yesno);
    ComboBox<String> movieBox = new ComboBox<String>(yesno);
    ComboBox<String> walkingBox = new ComboBox<String>(yesno);
    ComboBox<String> musicBox = new ComboBox<String>(yesno);
    ComboBox<String> democracyBox = new ComboBox<String>(yesno);
    
    //age slider declarations
    Slider ageSlider = new Slider();
    Slider ageMinSlider = new Slider();
    Slider ageMaxSlider = new Slider();
    
	//label declarations
	String style = "-fx-background-color: rgba(255, 255, 255, 1);";
    Button save = new Button("Apply Changes");
    Label age = new Label("Age:");
    Label genPrefLabel = new Label("Gender preference:");
    Label genIdenLabel = new Label("Gender:");
    Label location = new Label("Location:");
    Label intrest = new Label("Intrests:");
    Label agePref = new Label("Age preference:");
    Label ageMin = new Label("From:");
    Label ageMax = new Label("To:");
    Label dog = new Label("Do you like dogs?");
    Label dogHave = new Label("Do you enjoy one night stands?");
    Label vegetarian = new Label("Do you eat meat?");
    Label movie = new Label("Do you enjoy film?");
    Label walking = new Label("Do you enjoy excersizing?");
    Label music = new Label("Do you like music?");
    Label democracy = new Label("Do you want a long term relationship?");
    /**
     * a constructor, the constructor for the setting pane
     * @param hbox
     * @param rootpane
     */
	Setting(HBox hbox, GridPane rootpane) {

		ageSlider.setMin(18);
		ageSlider.setMax(60);
		ageSlider.setValue(18);
        ageSlider.setBlockIncrement(5);
        ageSlider.setMajorTickUnit(5);
        ageSlider.setShowTickLabels(true);
        ageSlider.setShowTickMarks(true);
        ageSlider.setSnapToTicks(true);
        
        ageMinSlider.setMin(18);
		ageMinSlider.setMax(60);
		ageMinSlider.setValue(18);
        ageMinSlider.setBlockIncrement(5);
        ageMinSlider.setMajorTickUnit(5);
        ageMinSlider.setShowTickLabels(true);
        ageMinSlider.setShowTickMarks(true);
        ageMinSlider.setSnapToTicks(true);
        
        ageMaxSlider.setMin(18);
		ageMaxSlider.setMax(60);
		ageMaxSlider.setValue(18);
        ageMaxSlider.setBlockIncrement(5);
        ageMaxSlider.setMajorTickUnit(5);
        ageMaxSlider.setShowTickLabels(true);
        ageMaxSlider.setShowTickMarks(true);
        ageMaxSlider.setSnapToTicks(true);
        
		//adding all of it to the gridpane
		GridPane gridPane = new GridPane();
        gridPane.setStyle(style);
        gridPane.setPadding(new Insets(25));
        gridPane.add(comboBox,1,3);
        gridPane.add(genPrefLabel, 0, 1);
        gridPane.add(genIdenLabel, 0, 0);
        gridPane.add(genderPref, 1, 1);
        gridPane.add(genderIden, 1, 0);
        gridPane.add(age, 0, 2);
        //gridPane.add(ageBox, 1, 2);
        gridPane.add(ageSlider, 1, 2);
        gridPane.add(location, 0, 3);
        gridPane.add(intrest, 0, 4);
        gridPane.add(agePref, 0, 5);
        gridPane.add(ageMin, 0, 6);
        //gridPane.add(ageMinBox, 1, 6);
        gridPane.add(ageMinSlider, 1, 6);
        gridPane.add(ageMax, 0, 7);
        //gridPane.add(ageMaxBox, 1, 7);
        gridPane.add(ageMaxSlider, 1, 7);
        gridPane.add(dog, 0, 8);
        gridPane.add(dogBox, 1, 8);
        gridPane.add(dogHave, 0, 9);
        gridPane.add(dogHaveBox, 1, 9);
        gridPane.add(vegetarian, 0, 10);
        gridPane.add(vegetarianBox, 1, 10);
        gridPane.add(movie, 0, 11);
        gridPane.add(movieBox, 1, 11);
        gridPane.add(walking, 0, 12);
        gridPane.add(walkingBox, 1, 12);
        gridPane.add(music, 0, 13);
        gridPane.add(musicBox, 1, 13);
        gridPane.add(democracy, 0, 14);
        gridPane.add(democracyBox, 1, 14);
        gridPane.add(save, 1, 500);
		//event handlers for the combo boxes
        genderPref.setOnAction(new EventHandler<ActionEvent>() {
         	 
            @Override
            public void handle(ActionEvent event) {
            	System.out.println("Gender preferne fuck you danielle ce:");
            	System.out.println(genderPref.getValue());
            }
        });
        genderIden.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent event) {
            	System.out.println("The user would like to identify as preference:");
            	System.out.println(genderIden.getValue());
            	}
        });
        comboBox.setOnAction(new EventHandler<ActionEvent>() {
         	 
            @Override
            public void handle(ActionEvent event) {
            	System.out.println("The user would like to change their location");
            	System.out.println(comboBox.getValue());
            	}
        });
        dogBox.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent event) {
            	System.out.println("The user has answered:");
            	System.out.println(dogBox.getValue());
            	}
        });
        dogHaveBox.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent event) {
            	System.out.println("The user has answered:");
            	System.out.println(dogHaveBox.getValue());
            	}
        });
        dogHaveBox.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent event) {
            	System.out.println("The user has answered:");
            	System.out.println(dogHaveBox.getValue());
            	}
        });
        vegetarianBox.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent event) {
            	System.out.println("The user has answered:");
            	System.out.println(vegetarianBox.getValue());
            	}
        });
        movieBox.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent event) {
            	System.out.println("The user has answered:");
            	System.out.println(movieBox.getValue());
            	}
        });
        walkingBox.setOnAction(new EventHandler<ActionEvent>() {
          	 
            @Override
            public void handle(ActionEvent event) {
            	System.out.println("The user has answered:");
            	System.out.println(walkingBox.getValue());
            	}
        });
        musicBox.setOnAction(new EventHandler<ActionEvent>() {
          	 
            @Override
            public void handle(ActionEvent event) {
            	System.out.println("The user has answered:");
            	System.out.println(musicBox.getValue());
            	}
        });
        democracyBox.setOnAction(new EventHandler<ActionEvent>() {
          	 
            @Override
            public void handle(ActionEvent event) {
            	System.out.println("The user has answered:");
            	System.out.println(democracyBox.getValue());
            	}
        });
		//pseudo code methods to sending values to SQL 
		save.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (ageMinSlider.getValue()<ageMaxSlider.getValue()) {
					sendToDataBase(ageMinSlider, ageMaxSlider, comboBox, ageSlider, dogBox, dogHaveBox, vegetarianBox, movieBox, walkingBox, musicBox, democracyBox, genderPref, genderIden);
				sendToProfile(hbox,rootpane);
				System.out.println("Changes saved");
				}
				else {
					System.out.print("Please input correct age limits");
				}
			}
		});
		this.getChildren().add(gridPane);
	}
	/**
	 * this method will send all the comboBox values to SQL
	 * @param comboBox
	 * @param comboBox1
	 * @param comboBox2
	 * @param comboBox3
	 * @param comboBox4
	 * @param comboBox5
	 * @param comboBox6
	 * @param comboBox7
	 * @param comboBox8
	 * @param genderBox
	 * @param genderBox1
	 */
	public void sendToDataBase(Slider ageMinSlider, Slider ageMaxSlider, ComboBox<String> comboBox, Slider ageSlider, ComboBox<String> comboBox2, ComboBox<String> comboBox3, ComboBox<String> comboBox4, ComboBox<String> comboBox5, ComboBox<String> comboBox6, ComboBox<String> comboBox7, ComboBox<String> comboBox8, ComboBox<String> genderBox, ComboBox<String> genderBox1) {
		//sendtoDatabase(comboBox.getValue());
		//sendtoDatabase(ageSlider.getValue());
		//sendtoDatabase(comboBox2.getValue());
		//sendtoDatabase(comboBox3.getValue());
		//sendtoDatabase(comboBox4.getValue());
		//sendtoDatabase(comboBox5.getValue());
		//sendtoDatabase(comboBox6.getValue());
		//sendtoDatabase(comboBox7.getValue());
		//sendtoDatabase(comboBox8.getValue());
		//sendtoDatabase(genderBox.getValue());
		//sendtoDatabase(genderBox1.getValue());
		//sendtoDatabase(ageMinSlider.getValue());
		//sendtoDatabase(ageMaxSlider.getValue());	
	}
	/**
	 * closes setting and sends the user back to profile
	 * @param hbox 
	 */
	private void sendToProfile(HBox hbox,GridPane rootpane) {
		Profile profile = new Profile(hbox, rootpane);
		this.getChildren().add(profile);
	}

}