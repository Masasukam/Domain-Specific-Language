package ast;

import libs.Node;

import java.io.PrintWriter;

public class Name extends Node {
    private final String name;
    private final Email email;


    public Name(String name, Email email) {
        this.name = name;
        this.email = email;
    }


    @Override
    public void evaluate(PrintWriter writer) throws Exception {
        writer.println("""
            <br><br>
            <br><br>
                        
                        
            <footer id = "footer">
              <! -- dynamic list to show contact information of user -->
              <div class = "footer-content" >
                <ul id="contactInfo">
                  <li>""" + "<li>" + "CONTACT INFORMATION\n" +
                "</li>"+ "<li>"+"My Name: " + this.name + "</li>" +"<li>"+
                "My Email Address: " + this.email.getEmail() + "@" + this.email.getMid() + "." + this.email.getEnd() +"</li>"+
            """
            </li>
                </ul>
              </div>
            </footer>
                """);
    }
}
