import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { OnloadscreenComponent } from './view/onloadscreen/onloadscreen.component';



const routes: Routes = [
  {path: '', redirectTo: 'onloadscreen', pathMatch: 'full'},
  {path: 'onloadscreen', component:OnloadscreenComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
