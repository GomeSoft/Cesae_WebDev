import { Component, EventEmitter, getNgModuleById, input, Input, Output } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MeuComponenteComponent } from "./components/meu-componente/meu-componente.component";
import { OutroComponenteComponent } from "./components/outro-componente/outro-componente.component";
import { Ex01Component } from "./exercicios/ex01/ex01.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MeuComponenteComponent, OutroComponenteComponent, Ex01Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})

export class AppComponent {
  title = 'novo-projecto';

  
  
}
