import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-content-viewmodal',
  templateUrl: './content-viewmodal.component.html',
  styleUrls: ['./content-viewmodal.component.css']
})
export class ContentViewmodalComponent implements OnInit {
contentView:any[];
id:number;
type:string;
property:Object;
filename:string;
  constructor(public dialogRef: MatDialogRef<ContentViewmodalComponent>,@Inject(MAT_DIALOG_DATA) public data: any) {
  this.contentView=data.content;  
  this.id=this.contentView["id"];
  this.type=this.contentView["type"];
  this.filename=this.contentView["fileName"];
  this.property=JSON.parse(this.contentView["property"]);
   }

  ngOnInit(): void {
  }

  closeContentView()
  {
    this.dialogRef.close();
  }

}
