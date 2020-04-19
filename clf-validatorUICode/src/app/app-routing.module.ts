import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { OnloadscreenComponent } from './view/onloadscreen/onloadscreen.component';
import { TableViewComponent } from './view/table-view/table-view.component';



const routes: Routes = [
  {path: '', redirectTo: 'clfHome', pathMatch: 'full'},
  {path: 'clfHome', component:OnloadscreenComponent},
  {path: 'viewAll', component:TableViewComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
