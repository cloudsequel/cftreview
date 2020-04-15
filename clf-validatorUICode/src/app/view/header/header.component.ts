import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  dateDisplay:number=Date.now();
 
  constructor() { }

  ngOnInit(): void {
// this.dateDisplay=new Date();
  }


  

 
}
