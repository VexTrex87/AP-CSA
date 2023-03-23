
public class Date {
	int month;
	int day;
	
	public Date(int month, int day) {
		this.month = month;
		this.day = day;
	}
	
	public String getFortune()  {
		if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
			return "As an Aries, you tend to forget a semicolon and spend an hour trying to find where it goes.";
		} else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
			return "As a Taurus, you tend to use light mode for every single website and app you use, even at night.";
		} else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
			return "As a Gemini, you tend to learn as many programming languages as you can so it seems like you know a lot, but you only know how to print \"Hello World\".";
		} else if ((month == 6 && day >= 22) || (month == 7 && day <= 23)) {
			return "As a Cancer, you tend to have twenty tabs of Stack Overflow open.";
		} else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
			return "As a Leo, you tend to use Vim because you lost your mouse months ago or your computer can't hand any other editor.";
		} else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
			return "As a Virgo, you tend to use ctrl+c and ctrl+v more than any other key.";
		} else if ((month == 9 && day >= 23) || (month == 10 && day <= 21)) {
			return "As a Libra, you most likely downloaded a code editor on your phone to write code when you're away from your computer.";
		} else if ((month == 10 && day >= 22) || (month == 11 && day <= 21)) {
			return "As a Scorpio, you tend to be a very fast typer. People stare at you, but it is because you are a very loud typer.";
		} else if ((month == 11 && day >= 22) || (month == 12 && day <= 20)) {
			return "As a Sagittarius, you still have no idea how programming works as you copied and pasted every single project you've made.";
		} else if ((month == 12 && day >= 21) || (month == 1 && day <= 20)) {
			return "As a Capricorn, you are most likely to say that block coding, HTML, and CSS are programming languages.";
		} else if ((month == 1 && day >= 21) || (month == 2 && day <= 19)) {
			return "As an Aquarius, you mix up the syntax on purpose to show people that you know a lot of programming langauges.";
		} else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
			return "As a Pisces, you are most likely to not know how to use Git, even after everyone around you tells you to.";
		} else {
			return "Your birthday was invalid.";
		}
	}
}
