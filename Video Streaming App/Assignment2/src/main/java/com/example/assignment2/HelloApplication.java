package com.example.assignment2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class HelloApplication extends Application {
    private Stage stage;
    private Scene gallaryScene, moneyHiestScene, quanticoScene, intimacyScene, thePrincessScene, loveGelatoScene,
    alongScene,cindScene,fallingScene,mebeforeyouScene,tallScene, sawScene, anabeleScene, whouseScene, orphanScene,
    bbloodScene, redeemingLoveScene, persuasionScene, chloeScene, crimesScene, againstScene, chooseScene, smileScene,
    blackScene, barbarianScene;
    private Parent root;

    @Override
    public void start(Stage stage) throws IOException {

        BorderPane root = new BorderPane();
        root.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(10))));
        root.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        VBox all = new VBox();

        //1st Category
        VBox container1 = new VBox();

        Text Category1 = new Text("TV Romance");
        Category1.setStyle
                (
                        "-fx-font-family: \"britannic bold\";"
                                + "-fx-font-size: 26px;"
                );

        Image firstImage = new Image("along.png");
        Image secondImage = new Image("cind.png");
        Image thirdImage = new Image("falling inn love.png");
        Image fourthImage = new Image("me before you.png");
        Image fifthImage = new Image("tall girl.png");
        Image sixthImage = new Image("redeeming.png");
        Image sevenththImage = new Image("persuasion.png");
        Image eighthImage = new Image("chloe.png");

        ImageView view1 = new ImageView(firstImage);
        view1.setFitWidth(250);
        view1.setPreserveRatio(true);
        ImageView view2 = new ImageView(secondImage);
        view2.setFitWidth(250);
        view2.setPreserveRatio(true);
        ImageView view3 = new ImageView(thirdImage);
        view3.setFitWidth(250);
        view3.setPreserveRatio(true);
        ImageView view4 = new ImageView(fourthImage);
        view4.setFitWidth(250);
        view4.setPreserveRatio(true);
        ImageView view5 = new ImageView(fifthImage);
        view5.setFitWidth(250);
        view5.setPreserveRatio(true);
        ImageView view6 = new ImageView(sixthImage);
        view6.setFitWidth(250);
        view6.setPreserveRatio(true);
        ImageView view7 = new ImageView(sevenththImage);
        view7.setFitWidth(250);
        view7.setPreserveRatio(true);
        ImageView view8 = new ImageView(eighthImage);
        view8.setFitWidth(250);
        view8.setPreserveRatio(true);

        /*ScrollBar scrollBar = new ScrollBar();
        scrollBar.setMax(100);
        scrollBar.setMin(0);
        scrollBar.setValue(50);
*/

        HBox romance = new HBox();
        romance.setSpacing(15);
        romance.setAlignment(Pos.CENTER_LEFT);
        romance.getChildren().addAll(view1, view2, view3, view4, view5, view6, view7, view8);

        //alongscene
        ImageView back01 = new ImageView("back.jpg");
        back01.setFitWidth(70);
        back01.setPreserveRatio(true);
        WebView webview01 = new WebView();
        webview01.getEngine().load(
                "https://www.youtube.com/embed/A1PTIxYrTVw    "
        );
        back01.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview01.getEngine().load(null);
        });
        view1.setOnMouseClicked(e -> {
            stage.setScene(alongScene);
            alongScene.setCursor(Cursor.HAND);
        });
        VBox layout01 = new VBox(20);
        layout01.getChildren().addAll(back01, webview01);
        alongScene = new Scene(layout01, 1350, 700);

        //cinderalla
        ImageView back02 = new ImageView("back.jpg");
        back02.setFitWidth(70);
        back02.setPreserveRatio(true);

        WebView webview02 = new WebView();
        webview02.getEngine().load(
                "https://www.youtube.com/embed/T1NeHRuPpoM"
        );
        back02.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview02.getEngine().load(null);
        });
        view2.setOnMouseClicked(e -> {
            stage.setScene(cindScene);
            cindScene.setCursor(Cursor.HAND);
        });
        VBox layout02 = new VBox(20);
        layout02.getChildren().addAll(back02, webview02);
        cindScene = new Scene(layout02, 1350, 700);

        //falling inn love
        ImageView back03 = new ImageView("back.jpg");
        back03.setFitWidth(70);
        back03.setPreserveRatio(true);
        WebView webview03 = new WebView();
        webview03.getEngine().load(
                "https://www.youtube.com/embed/P9vXNloQfTM"
        );
        back03.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview03.getEngine().load(null);
        });
        view3.setOnMouseClicked(e -> {
                stage.setScene(fallingScene);
        fallingScene.setCursor(Cursor.HAND);
        });
        VBox layout03= new VBox(20);
        layout03.getChildren().addAll(back03, webview03);
        fallingScene= new Scene(layout03,1350,700);

        //me before you
        ImageView back04 = new ImageView("back.jpg");
        back04.setFitWidth(70);
        back04.setPreserveRatio(true);
        WebView webview04 = new WebView();
        webview04.getEngine().load(
                "https://www.youtube.com/embed/Eh993__rOxA"
        );
        back04.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview04.getEngine().load(null);
        });
        view4.setOnMouseClicked(e -> {
            stage.setScene(mebeforeyouScene);
            mebeforeyouScene.setCursor(Cursor.HAND);
        });
        VBox layout04= new VBox(20);
        layout04.getChildren().addAll(back04, webview04);
        mebeforeyouScene= new Scene(layout04,1350,700);

        //tall girl
        ImageView back05 = new ImageView("back.jpg");
        back05.setFitWidth(70);
        back05.setPreserveRatio(true);
        WebView webview05 = new WebView();
        webview05.getEngine().load(
                "https://www.youtube.com/embed/NfpXeLVzJIw "
        );
        back05.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview05.getEngine().load(null);
        });
        view5.setOnMouseClicked(e -> {
            stage.setScene(tallScene);
            tallScene.setCursor(Cursor.HAND);
        });
        VBox layout05= new VBox(20);
        layout05.getChildren().addAll(back05, webview05);
        tallScene= new Scene(layout05,1350,700);

        //Redeeming love
        ImageView back06 = new ImageView("back.jpg");
        back06.setFitWidth(70);
        back06.setPreserveRatio(true);
        WebView webview06 = new WebView();
        webview06.getEngine().load(
                "https://www.youtube.com/embed/_8RIlIOd_us"
        );
        back06.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview06.getEngine().load(null);
        });
        view6.setOnMouseClicked(e -> {
            stage.setScene(redeemingLoveScene);
            redeemingLoveScene.setCursor(Cursor.HAND);
        });
        VBox layout06= new VBox(20);
        layout06.getChildren().addAll(back06, webview06);
        redeemingLoveScene= new Scene(layout06,1350,700);

        //Persuasion
        ImageView back07 = new ImageView("back.jpg");
        back07.setFitWidth(70);
        back07.setPreserveRatio(true);
        WebView webview07 = new WebView();
        webview07.getEngine().load(
                "https://www.youtube.com/embed/Fz7HmgPJQak"
        );
        back07.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview07.getEngine().load(null);
        });
        view7.setOnMouseClicked(e -> {
            stage.setScene(persuasionScene);
            persuasionScene.setCursor(Cursor.HAND);
        });
        VBox layout07= new VBox(20);
        layout07.getChildren().addAll(back07, webview07);
        persuasionScene= new Scene(layout07,1350,700);

        //Chloe
        ImageView back08 = new ImageView("back.jpg");
        back08.setFitWidth(70);
        back08.setPreserveRatio(true);
        WebView webview08 = new WebView();
        webview08.getEngine().load(
                "https://www.youtube.com/embed/TmubtKfX1O8"
        );
        back08.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview08.getEngine().load(null);
        });
        view8.setOnMouseClicked(e -> {
            stage.setScene(chloeScene);
            chloeScene.setCursor(Cursor.HAND);
        });
        VBox layout08= new VBox(20);
        layout08.getChildren().addAll(back08, webview08);
        chloeScene= new Scene(layout08,1350,700);

        HBox FirstCategoryTitles = new HBox();
        FirstCategoryTitles.setSpacing(180);
        FirstCategoryTitles.setAlignment(Pos.CENTER);

        Hyperlink one = new Hyperlink("ALONG");
        one.setOnMouseClicked(e -> stage.setScene(alongScene));

        Hyperlink two = new Hyperlink("CINDERELLA");
        two.setOnMouseClicked(e -> stage.setScene(cindScene));

        Hyperlink three = new Hyperlink("FALLING IN LOVE");
        three.setOnMouseClicked(e -> stage.setScene(fallingScene));

        Hyperlink four = new Hyperlink("ME BEFORE YOU");
        four.setOnMouseClicked(e -> stage.setScene(mebeforeyouScene));

        Hyperlink five = new Hyperlink("TALL GIRL");
        five.setOnMouseClicked(e -> stage.setScene(tallScene));

        Hyperlink six = new Hyperlink("REDEEMING LOVE");
        five.setOnMouseClicked(e -> stage.setScene(redeemingLoveScene));

        Hyperlink seven = new Hyperlink("PESUASION");
        five.setOnMouseClicked(e -> stage.setScene(persuasionScene));

        Hyperlink eight = new Hyperlink("CHLOE");
        five.setOnMouseClicked(e -> stage.setScene(chloeScene));

        FirstCategoryTitles.getChildren().addAll(one,two,three,four,five,six,seven,eight);


        container1.getChildren().addAll(Category1,romance,FirstCategoryTitles);

 //2nd Category
        VBox container2 = new VBox();

        Text Category2 = new Text("TV Dramas");
        Category2.setStyle
                (
                        "-fx-font-family: \"britannic bold\";"
                                + "-fx-font-size: 26px;"
                );

        Image first = new Image("MoneyHeist.png");
        Image second = new Image("Quantico.png");
        Image third = new Image("Intimacy.png");
        Image fourth = new Image("ThePrincess.png");
        Image fifth = new Image("Love&Gelato.png");
        Image sixth = new Image("crimes.png");
        Image seventh = new Image("against.png");
        Image eigth = new Image("choose.png");

        ImageView view01 = new ImageView(first);
        view01.setFitWidth(250);
        view01.setPreserveRatio(true);
        ImageView view02 = new ImageView(second);
        view02.setFitWidth(250);
        view02.setPreserveRatio(true);
        ImageView view03 = new ImageView(third);
        view03.setFitWidth(250);
        view03.setPreserveRatio(true);
        ImageView view04 = new ImageView(fourth);
        view04.setFitWidth(250);
        view04.setPreserveRatio(true);
        ImageView view05 = new ImageView(fifth);
        view05.setFitWidth(250);
        view05.setPreserveRatio(true);
        ImageView view06 = new ImageView(sixth);
        view06.setFitWidth(250);
        view06.setPreserveRatio(true);
        ImageView view07 = new ImageView(seventh);
        view07.setFitWidth(250);
        view07.setPreserveRatio(true);
        ImageView view08 = new ImageView(eigth);
        view08.setFitWidth(250);
        view08.setPreserveRatio(true);

        HBox drama = new HBox();
        drama.setSpacing(15);
        drama.setAlignment(Pos.CENTER_LEFT);
        drama.getChildren().addAll(view01, view02, view03, view04, view05, view06, view07, view08);

        //Money Heist Scene
        ImageView back1 = new ImageView("back.jpg");
        back1.setFitWidth(70);
        back1.setPreserveRatio(true);
        WebView webview1 = new WebView();
        webview1.getEngine().load(
                "https://www.youtube.com/embed/hMANIarjT50"
        );
        back1.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview1.getEngine().load(null);
        });
        view01.setOnMouseClicked(e -> {
            stage.setScene(moneyHiestScene);
            moneyHiestScene.setCursor(Cursor.HAND);
        });
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(back1,webview1);
        moneyHiestScene= new Scene(layout1, 1350, 700);

        //Quantico Scene
        ImageView back2 = new ImageView("back.jpg");
        back2.setFitWidth(70);
        back2.setPreserveRatio(true);
        WebView webview2 = new WebView();
        webview2.getEngine().load(
                "https://www.youtube.com/embed/NX0b2AN4Gt0"
        );
        back2.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview2.getEngine().load(null);
        });
        view02.setOnMouseClicked(e -> {
            stage.setScene(quanticoScene);
            quanticoScene.setCursor(Cursor.HAND);
        });
        VBox layout2= new VBox(20);
        layout2.getChildren().addAll(back2, webview2);
        quanticoScene= new Scene(layout2,1350,700);

        //Intimacy Scene
        ImageView back3 = new ImageView("back.jpg");
        back3.setFitWidth(70);
        back3.setPreserveRatio(true);
        WebView webview3 = new WebView();
        webview3.getEngine().load(
                "https://www.youtube.com/embed/9pZrPauX_WM"
        );
        back3.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview3.getEngine().load(null);
        });
        view03.setOnMouseClicked(e -> {
            stage.setScene(intimacyScene);
            intimacyScene.setCursor(Cursor.HAND);
        });
        VBox layout3= new VBox(20);
        layout3.getChildren().addAll(back3, webview3);
        intimacyScene= new Scene(layout3,1350,700);

        //The Princess Scene
        ImageView back4 = new ImageView("back.jpg");
        back4.setFitWidth(70);
        back4.setPreserveRatio(true);
        WebView webview4 = new WebView();
        webview4.getEngine().load(
                "https://www.youtube.com/embed/6kFCkfdOfMU"
        );
        back4.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview4.getEngine().load(null);
        });
        view04.setOnMouseClicked(e -> {
            stage.setScene(thePrincessScene);
            thePrincessScene.setCursor(Cursor.HAND);
        });
        VBox layout4= new VBox(20);
        layout4.getChildren().addAll(back4, webview4);
        thePrincessScene= new Scene(layout4,1350,700);

        //Love & Gelato Scene
        ImageView back5 = new ImageView("back.jpg");
        back5.setFitWidth(70);
        back5.setPreserveRatio(true);
        WebView webview5 = new WebView();
        webview5.getEngine().load(
                "https://www.youtube.com/embed/XIkQFUlBXF0"
        );
        back5.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview5.getEngine().load(null);
        });
        view05.setOnMouseClicked(e -> {
            stage.setScene(loveGelatoScene);
            loveGelatoScene.setCursor(Cursor.HAND);
        });
        VBox layout5= new VBox(20);
        layout5.getChildren().addAll(back5, webview5);
        loveGelatoScene= new Scene(layout5,1350,700);

        //Crimes of the future Scene
        ImageView back6 = new ImageView("back.jpg");
        back6.setFitWidth(70);
        back6.setPreserveRatio(true);
        WebView webview6 = new WebView();
        webview6.getEngine().load(
                "https://www.youtube.com/embed/MCAnQIs_kAs"
        );
        back6.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview6.getEngine().load(null);
        });
        view06.setOnMouseClicked(e -> {
            stage.setScene(crimesScene);
            crimesScene.setCursor(Cursor.HAND);
        });
        VBox layout6= new VBox(20);
        layout6.getChildren().addAll(back6, webview6);
        crimesScene= new Scene(layout6,1350,700);

        //Against Scene
        ImageView back7 = new ImageView("back.jpg");
        back7.setFitWidth(70);
        back7.setPreserveRatio(true);
        WebView webview7 = new WebView();
        webview7.getEngine().load(
                "https://www.youtube.com/embed/bEyyKwVORvo"
        );
        back7.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview7.getEngine().load(null);
        });
        view07.setOnMouseClicked(e -> {
            stage.setScene(againstScene);
            againstScene.setCursor(Cursor.HAND);
        });
        VBox layout7= new VBox(20);
        layout7.getChildren().addAll(back7, webview7);
        againstScene= new Scene(layout7,1350,700);

        //Choose or Die Scene
        ImageView back8 = new ImageView("back.jpg");
        back8.setFitWidth(70);
        back8.setPreserveRatio(true);
        WebView webview8 = new WebView();
        webview8.getEngine().load(
                "https://www.youtube.com/embed/7vUQYzZ_UZc"
        );
        back8.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview8.getEngine().load(null);
        });
        view08.setOnMouseClicked(e -> {
            stage.setScene(chooseScene);
            chooseScene.setCursor(Cursor.HAND);
        });
        VBox layout8= new VBox(20);
        layout8.getChildren().addAll(back8, webview8);
        chooseScene= new Scene(layout8,1350,700);


        HBox FirstCategoryTitles1 = new HBox();
        FirstCategoryTitles1.setSpacing(180);
        FirstCategoryTitles1.setAlignment(Pos.CENTER_LEFT);

        Hyperlink one1 = new Hyperlink("MONEY HIEST");
        one1.setOnMouseClicked(e -> stage.setScene(moneyHiestScene));

        Hyperlink two1 = new Hyperlink("QUANTICO");
        two1.setOnMouseClicked(e -> stage.setScene(quanticoScene));

        Hyperlink three1 = new Hyperlink("INTIMACY");
        three1.setOnMouseClicked(e -> stage.setScene(intimacyScene));

        Hyperlink four1 = new Hyperlink("THE PRINCESS");
        four1.setOnMouseClicked(e -> stage.setScene(thePrincessScene));

        Hyperlink five1 = new Hyperlink("LOVE GELATO");
        five1.setOnMouseClicked(e -> stage.setScene(loveGelatoScene));

        Hyperlink six1 = new Hyperlink("FUTURE CRIMES");
        six1.setOnMouseClicked(e -> stage.setScene(crimesScene));

        Hyperlink seven1 = new Hyperlink("AGAINST THE ICE");
        seven1.setOnMouseClicked(e -> stage.setScene(againstScene));

        Hyperlink eight1 = new Hyperlink("CHOOSE OR DIE");
        eight1.setOnMouseClicked(e -> stage.setScene(chooseScene));

        FirstCategoryTitles1.getChildren().addAll(one1,two1,three1,four1,five1,six1,seven1, eight1);

        container2.getChildren().addAll(Category2,drama,FirstCategoryTitles1);

        //3rd Category
        VBox container3 = new VBox();

        Text Category3 = new Text("TV Horrors");
        Category3.setStyle
                (
                        "-fx-font-family: \"britannic bold\";"
                                + "-fx-font-size: 26px;"
                );

        Image firstm = new Image("saw.png");
        Image secondm = new Image("anabele.png");
        Image thirdm = new Image("orphan.png");
        Image fourthm = new Image("blackblood.png");
        Image fifthm = new Image("whouse.png");
        Image sixthm = new Image("smile.png");
        Image seventhm = new Image("black.png");
        Image eigthm = new Image("barbarian.png");

        ImageView view001 = new ImageView(firstm);
        view001.setFitWidth(250);
        view001.setPreserveRatio(true);
        ImageView view002 = new ImageView(secondm);
        view002.setFitWidth(250);
        view002.setPreserveRatio(true);
        ImageView view003 = new ImageView(thirdm);
        view003.setFitWidth(250);
        view003.setPreserveRatio(true);
        ImageView view004 = new ImageView(fourthm);
        view004.setFitWidth(250);
        view004.setPreserveRatio(true);
        ImageView view005 = new ImageView(fifthm);
        view005.setFitWidth(250);
        view005.setPreserveRatio(true);
        ImageView view006 = new ImageView(sixthm);
        view006.setFitWidth(250);
        view006.setPreserveRatio(true);
        ImageView view007 = new ImageView(seventhm);
        view007.setFitWidth(250);
        view007.setPreserveRatio(true);
        ImageView view008 = new ImageView(eigthm);
        view008.setFitWidth(250);
        view008.setPreserveRatio(true);

        HBox horror = new HBox();
        horror.setSpacing(15);
        horror.setAlignment(Pos.CENTER_LEFT);
        horror.getChildren().addAll(view001, view002, view003, view004, view005, view006, view007, view008);

        //Saw Scene
        ImageView back001 = new ImageView("back.jpg");
        back001.setFitWidth(70);
        back001.setPreserveRatio(true);
        WebView webview001 = new WebView();
        webview001.getEngine().load(
                "https://www.youtube.com/embed/S-1QgOMQ-ls"
        );
        back001.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview001.getEngine().load(null);
        });
        view001.setOnMouseClicked(e -> {
            stage.setScene(sawScene);
            sawScene.setCursor(Cursor.HAND);
        });
        VBox layout001 = new VBox(20);
        layout001.getChildren().addAll(back001,webview001);
        sawScene= new Scene(layout001, 1350, 700);

        //Anabele Scene
        ImageView back002 = new ImageView("back.jpg");
        back002.setFitWidth(70);
        back002.setPreserveRatio(true);
        WebView webview002 = new WebView();
        webview002.getEngine().load(
                "https://www.youtube.com/embed/paFgQNPGlsg"
        );
        back002.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview002.getEngine().load(null);
        });
        view002.setOnMouseClicked(e -> {
            stage.setScene(anabeleScene);
            anabeleScene.setCursor(Cursor.HAND);
        });
        VBox layout002= new VBox(20);
        layout002.getChildren().addAll(back002, webview002);
        anabeleScene= new Scene(layout002,1350,700);

        //Orphan Scene
        ImageView back003 = new ImageView("back.jpg");
        back003.setFitWidth(70);
        back003.setPreserveRatio(true);
        WebView webview003 = new WebView();
        webview003.getEngine().load(
                "https://www.youtube.com/embed/m5BSLNAKIZs"
        );
        back003.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview003.getEngine().load(null);
        });
        view003.setOnMouseClicked(e -> {
            stage.setScene(orphanScene);
            orphanScene.setCursor(Cursor.HAND);
        });
        VBox layout003= new VBox(20);
        layout003.getChildren().addAll(back003, webview003);
        orphanScene= new Scene(layout003,1350,700);

        //Black Blood Scene
        ImageView back004 = new ImageView("back.jpg");
        back004.setFitWidth(70);
        back004.setPreserveRatio(true);
        WebView webview004 = new WebView();
        webview004.getEngine().load(
                "https://www.youtube.com/embed/cxMU62lRCZc"
        );
        back004.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview004.getEngine().load(null);
        });
        view004.setOnMouseClicked(e -> {
            stage.setScene(bbloodScene);
            bbloodScene.setCursor(Cursor.HAND);
        });
        VBox layout004= new VBox(20);
        layout004.getChildren().addAll(back004, webview004);
        bbloodScene= new Scene(layout004,1350,700);

        //The Wrong House Scene
        ImageView back005 = new ImageView("back.jpg");
        back005.setFitWidth(70);
        back005.setPreserveRatio(true);
        WebView webview005 = new WebView();
        webview005.getEngine().load(
                "https://www.youtube.com/embed/WaewToFT59c"
        );
        back005.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview005.getEngine().load(null);
        });
        view005.setOnMouseClicked(e -> {
            stage.setScene(whouseScene);
            whouseScene.setCursor(Cursor.HAND);
        });
        VBox layout005= new VBox(20);
        layout005.getChildren().addAll(back005, webview005);
        whouseScene= new Scene(layout005,1350,700);

        //Smile Scene
        ImageView back006 = new ImageView("back.jpg");
        back006.setFitWidth(70);
        back006.setPreserveRatio(true);
        WebView webview006 = new WebView();
        webview006.getEngine().load(
                "https://www.youtube.com/embed/BcDK7lkzzsU"
        );
        back006.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview006.getEngine().load(null);
        });
        view006.setOnMouseClicked(e -> {
            stage.setScene(smileScene);
            smileScene.setCursor(Cursor.HAND);
        });
        VBox layout006= new VBox(20);
        layout006.getChildren().addAll(back006, webview006);
        smileScene= new Scene(layout006,1350,700);

        //Black Phone Scene
        ImageView back007 = new ImageView("back.jpg");
        back007.setFitWidth(70);
        back007.setPreserveRatio(true);
        WebView webview007 = new WebView();
        webview007.getEngine().load(
                "https://www.youtube.com/embed/3eGP6im8AZA"
        );
        back007.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview007.getEngine().load(null);
        });
        view007.setOnMouseClicked(e -> {
            stage.setScene(blackScene);
            blackScene.setCursor(Cursor.HAND);
        });
        VBox layout007= new VBox(20);
        layout007.getChildren().addAll(back007, webview007);
        blackScene= new Scene(layout007,1350,700);

        //Black Phone Scene
        ImageView back008 = new ImageView("back.jpg");
        back008.setFitWidth(70);
        back008.setPreserveRatio(true);
        WebView webview008 = new WebView();
        webview008.getEngine().load(
                "https://www.youtube.com/embed/UEPJ954zH6A"
        );
        back008.setOnMouseClicked(event -> {
            stage.setScene(gallaryScene);
            webview008.getEngine().load(null);
        });
        view008.setOnMouseClicked(e -> {
            stage.setScene(barbarianScene);
            barbarianScene.setCursor(Cursor.HAND);
        });
        VBox layout008= new VBox(20);
        layout008.getChildren().addAll(back008, webview008);
        barbarianScene= new Scene(layout008,1350,700);

        HBox FirstCategoryTitles2 = new HBox();
        FirstCategoryTitles2.setSpacing(180);
        FirstCategoryTitles2.setAlignment(Pos.CENTER);

        Hyperlink one2 = new Hyperlink("SAW");
        one2.setOnMouseClicked(e -> stage.setScene(sawScene));

        Hyperlink two2 = new Hyperlink("ANABELE");
        two2.setOnMouseClicked(e -> stage.setScene(anabeleScene));

        Hyperlink three2 = new Hyperlink("THE ORPHAN");
        three2.setOnMouseClicked(e -> stage.setScene(orphanScene));

        Hyperlink four2 = new Hyperlink("BLACK BLOOD");
        four2.setOnMouseClicked(e -> stage.setScene(bbloodScene));

        Hyperlink five2 = new Hyperlink("WRONG HOUSE");
        five2.setOnMouseClicked(e -> stage.setScene(whouseScene));

        Hyperlink six2 = new Hyperlink("SMILE");
        six2.setOnMouseClicked(e -> stage.setScene(smileScene));

        Hyperlink seven2 = new Hyperlink("BLACK PHONE");
        seven2.setOnMouseClicked(e -> stage.setScene(blackScene));

        Hyperlink eight2 = new Hyperlink("BARBARIAN");
        eight2.setOnMouseClicked(e -> stage.setScene(barbarianScene));

        FirstCategoryTitles2.getChildren().addAll(one2,two2,three2,four2,five2,six2,seven2,eight2);

        container3.getChildren().addAll(Category3,horror,FirstCategoryTitles2);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(container1);
        scrollPane.setHmax(100);
        scrollPane.setHmin(0);

        scrollPane.setStyle(
                "-fx-font-family: \"britannic bold\";"
                        + "-fx-font-size: 15px;"+ "-fx-color:black;"
        );

        ScrollPane scrollPane1 = new ScrollPane();
        scrollPane1.setContent(container2);
        scrollPane1.setHmax(100);
        scrollPane1.setHmin(0);
        scrollPane1.setStyle(
                "-fx-font-family: \"britannic bold\";"
                        + "-fx-font-size: 15px;" + "-fx-color:black;"
        );

        ScrollPane scrollPane2 = new ScrollPane();
        scrollPane2.setContent(container3);
        scrollPane2.setHmax(100);
        scrollPane2.setHmin(0);
        scrollPane2.setStyle(
                "-fx-font-family: \"britannic bold\";"
                        + "-fx-font-size: 15px;"+ "-fx-color:black;"
        );

        all.getChildren().addAll(container1,scrollPane,container2, scrollPane1,container3,scrollPane2);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setCenter(all);


        //Gallery Scene
        gallaryScene = new Scene(root, 1350, 700);
        stage.setTitle(":::MY VIDEO STREAMING APP:::");
        stage.setScene(gallaryScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}