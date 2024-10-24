import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex01',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './ex01.component.html',
  styleUrl: './ex01.component.scss'
})
export class Ex01Component {
  
  nome: string = '';
  idade: any;

}
