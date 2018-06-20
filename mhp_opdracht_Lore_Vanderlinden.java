package hellotvxlet;

import javax.tv.xlet.*;
import org.havi.ui.*;
import org.dvb.ui.*;
import java.awt.*;

public class helloTVXlet implements Xlet
{
	XletContext actueleXletContext;
	HScene homePage;

	HStaticText headerTitel = new HStaticText("De Trappisten van België");
	headerTitel.setLocation(100, 100);
	headerTitel.setSize(600, 150);

	HTextButton rochefortButton = new HTextButton("Rochefort");
	rochefortButton.setLocation(100, 300);
	rochefortButton.setSize(400, 100);
	HTextButton westmalleButton = new HTextButton("Westmalle");
	westmalleButton.setLocation(100, 450);
	westmalleButton.setSize(400, 100);
	HTextButton westvleterenButton = new HTextButton("Westvleteren");
	westvleterenButton.setLocation(100, 600);
	westvleterenButton.setSize(400, 100);
	HTextButton chimayButton = new HTextButton("Chimay");
	chimayButton.setLocation(700, 300);
	chimayButton.setSize(400, 100);
	HTextButton orvalButton = new HTextButton("Orval");
	orvalButton.setLocation(700, 450);
	orvalButton.setSize(400, 100);
	HTextButton achelButton = new HTextButton("Achel");
	achelButton.setLocation(700, 600);
	achelButton.setSize(400, 100);
	HTextButton terugButton = new HTextButton("terug");
	terugButton.setLocation(700, 750);
	terugButton.setSize(200, 100);

	HStaticText rochefortHeader = new HStaticText("Rochefort");
	rochefortHeader.setLocation(100, 100);
	rochefortHeader.setSize(600, 150);
	HStaticText rochefortText = new HStaticText("Rochefort is een trappistenbier dat in de Abdij Notre-Dame \n de Saint-Rémy te Rochefort in de provincie Namen wordt gebrouwen.\n De Cisterciënzerabdij voor nonnen werd in 1230 opgericht, maar rond 1789 vernield.\n De abdij werd in 1887 weer opgebouwd,\n en het eerste Rochefortbier werd rond 1899 gebrouwen.");
	rochefortText.setLocation(100, 300);
	rochefortText.setSize(600, 600);

	HStaticText westmalleHeader = new HStaticText("Westmalle");
	westmalleHeader.setLocation(100, 100);
	westmalleHeader.setSize(600, 150);
	HStaticText westmalleText = new HStaticText("Westmalle is een trappistenbier dat in de abdij Onze-Lieve-Vrouw\n van het Heilig Hart van Westmalle wordt gebrouwen.\nHet klooster van Westmalle werd in 1836 tot abdij van de orde der trappisten verheven.\n In hetzelfde jaar begonnen de monniken met het brouwen van bier,\n aanvankelijk alleen voor eigen gebruik, maar vanaf 1856 ook voor de verkoop.\n De brouwerij is sindsdien diverse malen uitgebreid en gemoderniseerd, de laatste keer in 2001.");
	westmalleText.setLocation(100, 300);
	westmalleText.setSize(600, 600);

	HStaticText westvleterenHeader = new HStaticText("Westvleteren");
	westvleterenHeader.setLocation(100, 100);
	westvleterenHeader.setSize(600, 150);
	HStaticText westvleterenText = new HStaticText("Westvleteren is een trappistenbier dat gebrouwen wordt door\n de monniken van de Sint-Sixtusabdij van Westvleteren (West-Vlaanderen).");
	westvleterenText.setLocation(100, 300);
	westvleterenText.setSize(600, 600);

	HStaticText chimayHeader = new HStaticText("Chimay");
	chimayHeader.setLocation(100, 100);
	chimayHeader.setSize(600, 150);
	HStaticText chimayText = new HStaticText("Chimay is een trappistenbier dat in de Abdij Notre-Dame de Scourmont te Chimay\n in de Belgische provincie Henegouwen wordt gebrouwen.\n Jaarlijks wordt zo'n 170.000 hectoliter bier gebrouwen.");
	chimayText.setLocation(100, 300);
	chimayText.setSize(600, 600);

	HStaticText orvalHeader = new HStaticText("Orval");
	orvalHeader.setLocation(100, 100);
	orvalHeader.setSize(600, 150);
	HStaticText orvalText = new HStaticText("Orval is een trappistenbier dat in de abdij Notre-Dame d'Orval in de Belgische provincie Luxemburg wordt gebrouwen.\n Het bier is een buitenbeentje binnen de familie van de trappistenbieren,\n en van de Belgische bieren in het algemeen: er is slechts één variant algemeen verkrijgbaar,\n en deze is een relatief licht bier dat herinnert aan een Engelse ale.");
	orvalText.setLocation(100, 300);
	orvalText.setSize(600, 600);

	HStaticText achelHeader = new HStaticText("Achel");
	achelHeader.setLocation(100, 100);
	achelHeader.setSize(600, 150);
	HStaticText achelText = new HStaticText("Achel is het trappistenbier uit de huisbrouwerij \nvan de trappistenabdij De Achelse Kluis in Hamont-Achel.");
	achelText.setLocation(100, 300);
	achelText.setSize(600, 600);

	boolean rochefortVisible = false;
	boolean westmalleVisible = false;
	boolean westvleterenVisible = false;
	boolean chimayVisible = false;
	boolean orvalVisible = false;
	boolean achelVisible = false;

	public void initXlet(XletContext context)
	{
		this.actueleXletContext = context;

		HSceneTemplate sceneTemplate = new HSceneTemplate();

		sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_DIMENSION, new HScreenDimension(1.0f, 1.0f), HSceneTemplate.REQUIRED);
		sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_LOCATION, new HScreenPoint(0.0f, 0.0f), HSceneTemplate.REQUIRED);

		homePage = HSceneFactory.getInstance().getBestScene(sceneTemplate);

		homePage.add(headerTitel);

		rochefortButton.setBackground(color.BLUE);
		rochefortButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
		homePage.add(rochefortButton);

		westmalleButton.setBackground(color.BLUE);
		westmalleButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
		homePage.add(westmalleButton);

		westvleterenButton.setBackground(color.BLUE);
		westvleterenButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
		homePage.add(westvleterenButton);

		chimayButton.setBackground(color.BLUE);
		chimayButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
		homePage.add(chimayButton);

		orvalButton.setBackground(color.BLUE);
		orvalButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
		homePage.add(orvalButton);

		achelButton.setBackground(color.BLUE);
		achelButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
		homePage.add(achelButton);

		rochefortButton.setFocusTraversal(null, westmalleButton, null, chimayButton);
		westmalleButton.setFocusTraversal(rochefortButton, westmalleButton, null, orvalButton);
		westvleterenButton.setFocusTraversal(westmalleButton, null, null, achelButton);
		chimayButton.setFocusTraversal(null, orvalButton, rochefortButton, null);
		orvalButton.setFocusTraversal(chimayButton, achelButton, westmalleButton, null);
		achelButton.setFocusTraversal(orvalButton, null, westvleterenButton, null);

		rochefortButton.setActionCommand("rochefortButton");
		westmalleButton.setActionCommand("westmalleButton");
		westvleterenButton.setActionCommand("westvleterenButton");
		chimayButton.setActionCommand("chimayButton");
		orvalButton.setActionCommand("orvalButton");
		achelButton.setActionCommand("achelButton");
		terugButton.setActionCommand("terugButton");

		rochefortButton.addHActionListener(this);
		westmalleButton.addHActionListener(this);
		westvleterenButton.addHActionListener(this);
		chimayButton.addHActionListener(this);
		orvalButton.addHActionListener(this);
		achelButton.addHActionListener(this);
		terugButton.addHActionListener(this);

		rochefortButton.requestFocus();
	}

	public void startXlet() throws XletStateChangeException
	{
		homePage.validate();
		homePage.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0)
	{
		System.out.println(arg0.getActionCommand());

		if(arg0.getActionCommand().equals("rochefortButton"))
		{
			homePage.remove(rochefortButton);
			homePage.remove(westmalleButton);
			homePage.remove(westvleterenButton);
			homePage.remove(chimayButton);
			homePage.remove(orvalButton);
			homePage.remove(achelButton);
			homePage.remove(headerTitel);

			terugButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
			terugButton.setBackground(color.RED);
			homePage.add(terugButton);

			rochefortHeader.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(rochefortHeader);
			rochefortText.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(rochefortText);

			rochefortVisible = true;
			terugButton.requestFocus();
		}

		if(arg0.getActionCommand().equals("westmalleButton"))
		{
			homePage.remove(rochefortButton);
			homePage.remove(westmalleButton);
			homePage.remove(westvleterenButton);
			homePage.remove(chimayButton);
			homePage.remove(orvalButton);
			homePage.remove(achelButton);
			homePage.remove(headerTitel);

			terugButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
			terugButton.setBackground(color.RED);
			homePage.add(terugButton);

			westmalleHeader.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(westmalleHeader);
			westmalleText.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(westmalleText);

			westmalleVisible = true;
			terugButton.requestFocus();
		}

		if(arg0.getActionCommand().equals("westvleterenButton"))
		{
			homePage.remove(rochefortButton);
			homePage.remove(westmalleButton);
			homePage.remove(westvleterenButton);
			homePage.remove(chimayButton);
			homePage.remove(orvalButton);
			homePage.remove(achelButton);
			homePage.remove(headerTitel);

			terugButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
			terugButton.setBackground(color.RED);
			homePage.add(terugButton);

			westvleterenHeader.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(westvleterenHeader);
			westvleterenText.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(westvleterenText);

			westvleterenVisible = true;
			terugButton.requestFocus();
		}

		if(arg0.getActionCommand().equals("chimayButton"))
		{
			homePage.remove(rochefortButton);
			homePage.remove(westmalleButton);
			homePage.remove(westvleterenButton);
			homePage.remove(chimayButton);
			homePage.remove(orvalButton);
			homePage.remove(achelButton);
			homePage.remove(headerTitel);

			terugButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
			terugButton.setBackground(color.RED);
			homePage.add(terugButton);

			chimayHeader.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(chimayHeader);
			chimayText.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(chimayText);

			chimayVisible = true;
			terugButton.requestFocus();
		}

		if(arg0.getActionCommand().equals("orvalButton"))
		{
			homePage.remove(rochefortButton);
			homePage.remove(westmalleButton);
			homePage.remove(westvleterenButton);
			homePage.remove(chimayButton);
			homePage.remove(orvalButton);
			homePage.remove(achelButton);
			homePage.remove(headerTitel);

			terugButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
			terugButton.setBackground(color.RED);
			homePage.add(terugButton);

			orvalHeader.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(orvalHeader);
			orvalText.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(orvalText);

			orvalVisible = true;
			terugButton.requestFocus();
		}

		if(arg0.getActionCommand().equals("achelButton"))
		{
			homePage.remove(rochefortButton);
			homePage.remove(westmalleButton);
			homePage.remove(westvleterenButton);
			homePage.remove(chimayButton);
			homePage.remove(orvalButton);
			homePage.remove(achelButton);
			homePage.remove(headerTitel);

			terugButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
			terugButton.setBackground(color.RED);
			homePage.add(terugButton);

			achelHeader.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(achelHeader);
			achelText.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(achelText);

			achelVisible = true;
			terugButton.requestFocus();
		}

		if(arg0.getActionCommand().equals("terugButton"))
		{
			homePage.remove(terugButton);

			if(rochefortVisible)
			{
				homePage.remove(rochefortHeader);
				homePage.remove(rochefortText);
			}

			if(westmalleVisible)
			{
				homePage.remove(westmalleHeader);
				homePage.remove(westmalleText);
			}

			if(westvleterenVisible)
			{
				homePage.remove(westvleterenHeader);
				homePage.remove(westmalleText);
			}

			if(chimayVisible)
			{
				homePage.remove(chimayHeader);
				homePage.remove(chimayText);
			}

			if(orvalVisible)
			{
				homePage.remove(orvalHeader);
				homePage.remove(orvalText);
			}

			if(achelVisible)
			{
				homePage.remove(achelHeader);
				homePage.remove(achelText);
			}

			rochefortButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
			rochefortButton.setBackground(color.BLUE);
			homePage.add(rochefortButton);

			westmalleButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
			westmalleButton.setBackground(color.BLUE);
			homePage.add(westmalleButton);

			westvleterenButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
			westvleterenButton.setBackground(color.BLUE);
			homePage.add(westvleterenButton);

			chimayButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
			chimayButton.setBackground(color.BLUE);
			homePage.add(chimayButton);

			orvalButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
			orvalButton.setBackground(color.BLUE);
			homePage.add(orvalButton);

			achelButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
			achelButton.setBackground(color.BLUE);
			homePage.add(achelButton);

			headerTitel.setBackgroundMode(HVisible.BACKGROUND_FILL);
			homePage.add(headerTitel);
		}
	}
}
