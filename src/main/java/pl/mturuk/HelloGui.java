package pl.mturuk;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("hello")
@StyleSheet("/css/style.css")
public class HelloGui extends VerticalLayout {

	

	public HelloGui() {

		TextField textFieldHello = new TextField("PODAJ IMIĘ");
		Button buttonHello = new Button("NACIŚNIJ", new Icon(VaadinIcon.CURSOR));
		Label labelName = new Label();

		buttonHello.addClickListener(ClickEvent -> {
			labelName.setText("CZEŚĆ: " + textFieldHello.getValue());

			add(new Image("https://media.tenor.com/images/deeb9cf9a27088cf2a11a8974eb4e6f4/tenor.gif",
					"SORRY COŚ POSZŁO NIE TAK"));
		});

		add(textFieldHello, buttonHello, labelName);
	}
}
