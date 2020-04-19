import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from "@angular/material/dialog";

@Component({
  selector: 'app-message-display',
  templateUrl: './message-display.component.html',
  styleUrls: ['./message-display.component.css']
})
export class MessageDisplayComponent implements OnInit {

  messageValue:any[];

 constructor(public dialogRef: MatDialogRef<MessageDisplayComponent>,@Inject(MAT_DIALOG_DATA) public data: any) {
   this.messageValue=data.confirmationMessage
  }

  ngOnInit(): void {

    
  }

 
  closeAlert() {
    this.dialogRef.close();
  }
}
