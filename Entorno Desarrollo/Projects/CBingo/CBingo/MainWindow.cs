using System;
using Gtk;
using CBingo;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        Panel panel = new Panel(vbox1);
        Bombo Bombo = new Bombo();
      //  BJugar.Clicked += delegate {

        //    int numero = Bombo.sacarBola();
        //};
    }


    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnBJugarClicked(object sender, EventArgs e)
    {

        Bombo Bombo = new Bombo();

        int numero = Bombo.sacarBola();

        //Random r = new Random();


    }
}
