public class Persona {
    int numTelefonico;
    String email;


public Persona(int num, String email){
    setnumTelefonico(num);
    setEmail(email);
}

public void setnumTelefonico (int num){
    this.numTelefonico = num;
}

public int getnumTelefonico () {
    return numTelefonico;
}

public void setEmail (String email){
    this.email = email;
}

public String getEmail () {
    return email;
}

}