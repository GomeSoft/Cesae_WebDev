@extends("layouts.femaster");

@section("content")

<h3>Sou uma blade para todos os users </h3>
<body>
    <h3>Sou uma blade para todos os users</h3>
    <ul>
        @foreach ($users as $user)
        <li>
            O nome é: {{$user['name']}} e o número de telefone é: {{$user['phone']}}
        </li>
        @endforeach
    </ul>
</body>

@endsection