﻿using System;
using System.Collections.Generic;
using Gtk;

namespace CBingo {

    public class Bombo{

        private IList<int> bolas = new List<int>();
        private Random r = new Random();
        public Bombo() { 
        
            for(int bola = 1; bola <= 90; bola++) {
                bolas.Add(bola);

            }//FIN DEL FOR
        }
        public int sacarBola()
        {
            int Aleatorio = r.Next(1,90);
            int bola = bolas[Aleatorio];
            bolas.RemoveAt(Aleatorio);
            return bola;

        }

    }

}