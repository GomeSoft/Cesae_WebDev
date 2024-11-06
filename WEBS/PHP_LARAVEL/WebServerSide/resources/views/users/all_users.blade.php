@extends("layouts.femaster");

@section("content")

<body>
    <h3>Sou uma blade para todos os users</h3>
    <table class="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Nome</th>
            <th scope="col">Email</th>
            <th scope="col">NIF</th>
          </tr>
        </thead>
        <tbody>
            @foreach ($users as $user)

                <tr>
                    <th scope="row">{{$user -> id}}</th>
                    <td>{{$user -> name}}</td>
                    <td>{{$user -> email}}</td>
                    <td>{{$user -> nif}}</td>
                </tr>
            @endforeach    
        </tbody>
      </table>
    <ul>
        @foreach ($users as $user)
        <li>
            O nome é: {{$user -> name}} e o número de email é: {{$user -> email}}
        </li>
        @endforeach
    </ul>
</body>

@endsection