import { Component, OnInit } from '@angular/core';
import {Credentials} from '../../Credentials';
import {Router} from '@angular/router';
import {UserService} from '../../service/user.service';

@Component({
  selector: 'sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {
   credentials: Credentials = new Credentials();
   message = '';

  constructor(private router: Router, private serv: UserService) { }

  ngOnInit() {
  }

  submit() {
    console.log(this.credentials);
    this.serv.verify(this.credentials).subscribe(data => {
      if (data.verified == true) {
        this.router.navigate(['admin']);
      }
      else {
        this.message = 'in correct user name or password';
      }

      }, error => {console.log(error); this.message = ''; alert('Invalid user name or password'); });


  }
}
