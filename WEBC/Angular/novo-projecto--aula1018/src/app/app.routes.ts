import { Routes } from '@angular/router';
import { Ex01Component } from './exercicios/ex01/ex01.component';
import { NoteFoundComponent } from './exercicios/note-found/note-found.component';
import { OutroComponenteComponent } from './components/outro-componente/outro-componente.component';

export const routes: Routes = [
    {path: 'ex01', title: 'exercicio01', component: Ex01Component},
    {path: 'outro', component:NoteFoundComponent},

    {path: '', redirectTo: '/outro', pathMatch: 'full'},
    {path: '**', component:NoteFoundComponent}
];
