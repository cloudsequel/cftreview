import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-success-message',
  templateUrl: './success-message.component.html',
  styleUrls: ['./success-message.component.css']
})
export class SuccessMessageComponent implements OnInit {
  successMessage:string;
  constructor(public dialogRef: MatDialogRef<SuccessMessageComponent>,@Inject(MAT_DIALOG_DATA) public data: any) { 
    this.successMessage=data.confirmationMessage
  }

  ngOnInit(): void {
  }


  closeAlertSuccess() {
    this.dialogRef.close();
  }
}
