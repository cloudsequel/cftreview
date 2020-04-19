import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from "@angular/material/dialog";

@Component({
  selector: 'app-error-message',
  templateUrl: './error-message.component.html',
  styleUrls: ['./error-message.component.css']
})
export class ErrorMessageComponent implements OnInit {
  failureMessage:string;
  constructor(public dialogRef: MatDialogRef<ErrorMessageComponent>,@Inject(MAT_DIALOG_DATA) public data: any) { 
    this.failureMessage=data.confirmationMessage
  }

  ngOnInit(): void {
  }

  closeAlertFailure() {
    this.dialogRef.close();
  }
}
