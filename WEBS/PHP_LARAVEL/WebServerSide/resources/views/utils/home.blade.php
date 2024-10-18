@extends("layouts.femaster");

@section("content")
    
    @php
        $myvar = 'Olá Mundo!'
        
    @endphp

    @if($myName)
        <p>{{$myName}}</p>
        @else
        <p>Nome não encontrado</p>
    @endif

    <h5>Olá, essa é a nossa casa</h5>
    <p>{{$myFirstVar}}</p>



    <ul>
        @foreach($weekDays as $day)
        <li>{{$day}}</li>
        @endforeach
    </ul>

    <ul>
        <h5>Dados do curso</h5>
        <p>Nome: {{$courseInfo['name']}}</p>
        <p>Horas: {{$courseInfo['hours']}}</p>
    </ul>

    
        <h3>Dados do cesae:</h3>
        <p>Centro: {{$cesaeInfo['name']}}</p>
        <p>Endereço: {{$cesaeInfo['address']}}</p>
        <p>Email: {{$cesaeInfo['email']}}</p>
        
    

    <ul>
        <li><a href="{{ route('welcome') }}">Welcome</a></li>
        <li><a href="{{ route('users.all') }}">Todos os Users</a></li>
        <li><a href="{{ route('users.add') }}">Adicionar</a></li>
    </ul>

@endsection

