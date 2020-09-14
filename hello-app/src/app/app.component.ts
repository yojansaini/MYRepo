import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
  <div style="text-align:center" class="content">
  <h1>
  Welcome to {{title}}</h1>
  <h2>Github Jenkins integration attempt</h2>
  </div>
  `,
  styles: []
})
export class AppComponent {
  title = 'hello-app';
}
