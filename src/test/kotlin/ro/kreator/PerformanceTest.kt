package ro.kreator

import org.apache.commons.lang3.RandomStringUtils
import org.junit.Test
import java.lang.reflect.TypeVariable
import java.util.*
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KProperty
import kotlin.reflect.KType
import kotlin.reflect.full.valueParameters
import kotlin.reflect.jvm.isAccessible
import kotlin.reflect.jvm.javaType
import kotlin.reflect.jvm.jvmErasure
import kotlin.system.measureTimeMillis

class PerformanceTest {
    val a0 by aRandomListOf<ManyParams>()
    val a1 by aRandom<ManyParams>()
    val a2 by aRandom<ManyParams>()
    val a3 by aRandom<ManyParams>()
    val a4 by aRandom<ManyParams>()
    val a5 by aRandom<ManyParams>()
    val a6 by aRandom<ManyParams>()
    val a7 by aRandom<ManyParams>()
    val a8 by aRandom<ManyParams>()
    val a9 by aRandom<ManyParams>()
    val a10 by aRandom<ManyParams>()
    val a11 by aRandom<ManyParams>()
    val a12 by aRandom<ManyParams>()
    val a13 by aRandom<ManyParams>()
    val a14 by aRandom<ManyParams>()
    val a15 by aRandom<ManyParams>()
    val a16 by aRandom<ManyParams>()
    val a17 by aRandom<ManyParams>()
    val a18 by aRandom<ManyParams>()
    val a19 by aRandom<ManyParams>()
    val a20 by aRandom<ManyParams>()
    val a21 by aRandom<ManyParams>()
    val a22 by aRandom<ManyParams>()
    val a23 by aRandom<ManyParams>()
    val a24 by aRandom<ManyParams>()
    val a25 by aRandom<ManyParams>()
    val a26 by aRandom<ManyParams>()
    val a27 by aRandom<ManyParams>()
    val a28 by aRandom<ManyParams>()
    val a29 by aRandom<ManyParams>()
    val a30 by aRandom<ManyParams>()
    val a31 by aRandom<ManyParams>()
    val a32 by aRandom<ManyParams>()
    val a33 by aRandom<ManyParams>()
    val a34 by aRandom<ManyParams>()
    val a35 by aRandom<ManyParams>()
    val a36 by aRandom<ManyParams>()
    val a37 by aRandom<ManyParams>()
    val a38 by aRandom<ManyParams>()
    val a39 by aRandom<ManyParams>()
    val a40 by aRandom<ManyParams>()
    val a41 by aRandom<ManyParams>()
    val a42 by aRandom<ManyParams>()
    val a43 by aRandom<ManyParams>()
    val a44 by aRandom<ManyParams>()
    val a45 by aRandom<ManyParams>()
    val a46 by aRandom<ManyParams>()
    val a47 by aRandom<ManyParams>()
    val a48 by aRandom<ManyParams>()
    val a49 by aRandom<ManyParams>()
    val a50 by aRandom<ManyParams>()
    val a51 by aRandom<ManyParams>()
    val a52 by aRandom<ManyParams>()
    val a53 by aRandom<ManyParams>()
    val a54 by aRandom<ManyParams>()
    val a55 by aRandom<ManyParams>()
    val a56 by aRandom<ManyParams>()
    val a57 by aRandom<ManyParams>()
    val a58 by aRandom<ManyParams>()
    val a59 by aRandom<ManyParams>()
    val a60 by aRandom<ManyParams>()
    val a61 by aRandom<ManyParams>()
    val a62 by aRandom<ManyParams>()
    val a63 by aRandom<ManyParams>()
    val a64 by aRandom<ManyParams>()
    val a65 by aRandom<ManyParams>()
    val a66 by aRandom<ManyParams>()
    val a67 by aRandom<ManyParams>()
    val a68 by aRandom<ManyParams>()
    val a69 by aRandom<ManyParams>()
    val a70 by aRandom<ManyParams>()
    val a71 by aRandom<ManyParams>()
    val a72 by aRandom<ManyParams>()
    val a73 by aRandom<ManyParams>()
    val a74 by aRandom<ManyParams>()
    val a75 by aRandom<ManyParams>()
    val a76 by aRandom<ManyParams>()
    val a77 by aRandom<ManyParams>()
    val a78 by aRandom<ManyParams>()
    val a79 by aRandom<ManyParams>()
    val a80 by aRandom<ManyParams>()
    val a81 by aRandom<ManyParams>()
    val a82 by aRandom<ManyParams>()
    val a83 by aRandom<ManyParams>()
    val a84 by aRandom<ManyParams>()
    val a85 by aRandom<ManyParams>()
    val a86 by aRandom<ManyParams>()
    val a87 by aRandom<ManyParams>()
    val a88 by aRandom<ManyParams>()
    val a89 by aRandom<ManyParams>()
    val a90 by aRandom<ManyParams>()
    val a91 by aRandom<ManyParams>()
    val a92 by aRandom<ManyParams>()
    val a93 by aRandom<ManyParams>()
    val a94 by aRandom<ManyParams>()
    val a95 by aRandom<ManyParams>()
    val a96 by aRandom<ManyParams>()
    val a97 by aRandom<ManyParams>()
    val a98 by aRandom<ManyParams>()
    val a99 by aRandom<ManyParams>()
    val a100 by aRandom<ManyParams>()
    val a101 by aRandom<ManyParams>()
    val a102 by aRandom<ManyParams>()
    val a103 by aRandom<ManyParams>()
    val a104 by aRandom<ManyParams>()
    val a105 by aRandom<ManyParams>()
    val a106 by aRandom<ManyParams>()
    val a107 by aRandom<ManyParams>()
    val a108 by aRandom<ManyParams>()
    val a109 by aRandom<ManyParams>()
    val a110 by aRandom<ManyParams>()
    val a111 by aRandom<ManyParams>()
    val a112 by aRandom<ManyParams>()
    val a113 by aRandom<ManyParams>()
    val a114 by aRandom<ManyParams>()
    val a115 by aRandom<ManyParams>()
    val a116 by aRandom<ManyParams>()
    val a117 by aRandom<ManyParams>()
    val a118 by aRandom<ManyParams>()
    val a119 by aRandom<ManyParams>()
    val a120 by aRandom<ManyParams>()
    val a121 by aRandom<ManyParams>()
    val a122 by aRandom<ManyParams>()
    val a123 by aRandom<ManyParams>()
    val a124 by aRandom<ManyParams>()
    val a125 by aRandom<ManyParams>()
    val a126 by aRandom<ManyParams>()
    val a127 by aRandom<ManyParams>()
    val a128 by aRandom<ManyParams>()
    val a129 by aRandom<ManyParams>()
    val a130 by aRandom<ManyParams>()
    val a131 by aRandom<ManyParams>()
    val a132 by aRandom<ManyParams>()
    val a133 by aRandom<ManyParams>()
    val a134 by aRandom<ManyParams>()
    val a135 by aRandom<ManyParams>()
    val a136 by aRandom<ManyParams>()
    val a137 by aRandom<ManyParams>()
    val a138 by aRandom<ManyParams>()
    val a139 by aRandom<ManyParams>()
    val a140 by aRandom<ManyParams>()
    val a141 by aRandom<ManyParams>()
    val a142 by aRandom<ManyParams>()
    val a143 by aRandom<ManyParams>()
    val a144 by aRandom<ManyParams>()
    val a145 by aRandom<ManyParams>()
    val a146 by aRandom<ManyParams>()
    val a147 by aRandom<ManyParams>()
    val a148 by aRandom<ManyParams>()
    val a149 by aRandom<ManyParams>()
    val a150 by aRandom<ManyParams>()
    val a151 by aRandom<ManyParams>()
    val a152 by aRandom<ManyParams>()
    val a153 by aRandom<ManyParams>()
    val a154 by aRandom<ManyParams>()
    val a155 by aRandom<ManyParams>()
    val a156 by aRandom<ManyParams>()
    val a157 by aRandom<ManyParams>()
    val a158 by aRandom<ManyParams>()
    val a159 by aRandom<ManyParams>()
    val a160 by aRandom<ManyParams>()
    val a161 by aRandom<ManyParams>()
    val a162 by aRandom<ManyParams>()
    val a163 by aRandom<ManyParams>()
    val a164 by aRandom<ManyParams>()
    val a165 by aRandom<ManyParams>()
    val a166 by aRandom<ManyParams>()
    val a167 by aRandom<ManyParams>()
    val a168 by aRandom<ManyParams>()
    val a169 by aRandom<ManyParams>()
    val a170 by aRandom<ManyParams>()
    val a171 by aRandom<ManyParams>()
    val a172 by aRandom<ManyParams>()
    val a173 by aRandom<ManyParams>()
    val a174 by aRandom<ManyParams>()
    val a175 by aRandom<ManyParams>()
    val a176 by aRandom<ManyParams>()
    val a177 by aRandom<ManyParams>()
    val a178 by aRandom<ManyParams>()
    val a179 by aRandom<ManyParams>()
    val a180 by aRandom<ManyParams>()
    val a181 by aRandom<ManyParams>()
    val a182 by aRandom<ManyParams>()
    val a183 by aRandom<ManyParams>()
    val a184 by aRandom<ManyParams>()
    val a185 by aRandom<ManyParams>()
    val a186 by aRandom<ManyParams>()
    val a187 by aRandom<ManyParams>()
    val a188 by aRandom<ManyParams>()
    val a189 by aRandom<ManyParams>()
    val a190 by aRandom<ManyParams>()
    val a191 by aRandom<ManyParams>()
    val a192 by aRandom<ManyParams>()
    val a193 by aRandom<ManyParams>()
    val a194 by aRandom<ManyParams>()
    val a195 by aRandom<ManyParams>()
    val a196 by aRandom<ManyParams>()
    val a197 by aRandom<ManyParams>()
    val a198 by aRandom<ManyParams>()
    val a199 by aRandom<ManyParams>()
    val a200 by aRandom<ManyParams>()
    val a201 by aRandom<ManyParams>()
    val a202 by aRandom<ManyParams>()
    val a203 by aRandom<ManyParams>()
    val a204 by aRandom<ManyParams>()
    val a205 by aRandom<ManyParams>()

    @Test
    fun isFast() {


        measureTimeMillis {
            yo().a0
            yo().a1
            yo().a2
            yo().a3
            yo().a4
            yo().a5
            yo().a6
            yo().a7
            yo().a8
            yo().a9
            yo().a10
            yo().a11
            yo().a12
            yo().a13
            yo().a14
            yo().a15
            yo().a16
            yo().a17
            yo().a18
            yo().a19
            yo().a20
            yo().a21
            yo().a22
            yo().a23
            yo().a24
            yo().a25
            yo().a26
            yo().a27
            yo().a28
            yo().a29
            yo().a30
            yo().a31
            yo().a32
            yo().a33
            yo().a34
            yo().a35
            yo().a36
            yo().a37
            yo().a38
            yo().a39
            yo().a40
            yo().a41
            yo().a42
            yo().a43
            yo().a44
            yo().a45
            yo().a46
            yo().a47
            yo().a48
            yo().a49
            yo().a50
            yo().a51
            yo().a52
            yo().a53
            yo().a54
            yo().a55
            a56
            a57
            a58
            a59
            a60
            a61
            a62
            a63
            a64
            a65
            a66
            a67
            a68
            a69
            a70
            a71
            a72
            a73
            a74
            a75
            a76
            a77
            a78
            a79
            a80
            a81
            a82
            a83
            a84
            a85
            a86
            a87
            a88
            a89
            a90
            a91
            a92
            a93
            a94
            a95
            a96
            a97
            a98
            a99
            a100
            a101
            a102
            a103
            a104
            a105
            a106
            a107
            a108
            a109
            a110
            a111
            a112
            a113
            a114
            a115
            a116
            a117
            a118
            a119
            a120
            a121
            a122
            a123
            a124
            a125
            a126
            a127
            a128
            a129
            a130
            a131
            a132
            a133
            a134
            a135
            a136
            a137
            a138
            a139
            a140
            a141
            a142
            a143
            a144
            a145
            a146
            a147
            a148
            a149
            a150
            a151
            a152
            a153
            a154
            a155
            a156
            a157
            a158
            a159
            a160
            a161
            a162
            a163
            a164
            a165
            a166
            a167
            a168
            a169
            a170
            a171
            a172
            a173
            a174
            a175
            a176
            a177
            a178
            a179
            a180
            a181
            a182
            a183
            a184
            a185
            a186
            a187
            a188
            a189
            a190
            a191
            a192
            a193
            a194
            a195
            a196
            a197
            a198
            a199
            a200
            a201
            a202
        }.print()
    }


    private fun instantiateArbitraryClass(klass: KClass<out Any>, token: Token, type: KType, past: Set<KClass<*>>, kProperty: KProperty<*>?): Any? {
        val constructors = klass.constructors.filter { !it.parameters.any { (it.type.jvmErasure == klass) } }.toList()
        if (constructors.isEmpty() && klass.constructors.any { it.parameters.any { (it.type.jvmErasure == klass) } }) throw CyclicException()
        val defaultConstructor = constructors[pseudoRandom(token).int(constructors.size)] as KFunction<*>
        defaultConstructor.isAccessible = true
        val constructorTypeParameters = defaultConstructor.valueParameters.map { it.type.toString().replace("!", "").replace("?", "") }.toMutableList()
        val typeMap = type.jvmErasure.typeParameters.map { it.name }.zip(type.arguments).toMap()
        val pairedConstructor = defaultConstructor.parameters.map { if (it.type.javaType is TypeVariable<*>) constructorTypeParameters.get(it.index) to it else "" to it }
        return Any()
    }

    private fun pseudoRandom(token: Long): Random = Random(Seed.seed with token)
    internal infix fun Long.with(other: Long): Long = this * 31 + other
    private fun Random.int(bound: Int) = if (bound == 0) 0 else nextInt(bound)
}

class yo {
    val a0 by aRandomListOf<ManyParams>()
    val a1 by aRandom<ManyParams>()
    val a2 by aRandom<ManyParams>()
    val a3 by aRandom<ManyParams>()
    val a4 by aRandom<ManyParams>()
    val a5 by aRandom<ManyParams>()
    val a6 by aRandom<ManyParams>()
    val a7 by aRandom<ManyParams>()
    val a8 by aRandom<ManyParams>()
    val a9 by aRandom<ManyParams>()
    val a10 by aRandom<ManyParams>()
    val a11 by aRandom<ManyParams>()
    val a12 by aRandom<ManyParams>()
    val a13 by aRandom<ManyParams>()
    val a14 by aRandom<ManyParams>()
    val a15 by aRandom<ManyParams>()
    val a16 by aRandom<ManyParams>()
    val a17 by aRandom<ManyParams>()
    val a18 by aRandom<ManyParams>()
    val a19 by aRandom<ManyParams>()
    val a20 by aRandom<ManyParams>()
    val a21 by aRandom<ManyParams>()
    val a22 by aRandom<ManyParams>()
    val a23 by aRandom<ManyParams>()
    val a24 by aRandom<ManyParams>()
    val a25 by aRandom<ManyParams>()
    val a26 by aRandom<ManyParams>()
    val a27 by aRandom<ManyParams>()
    val a28 by aRandom<ManyParams>()
    val a29 by aRandom<ManyParams>()
    val a30 by aRandom<ManyParams>()
    val a31 by aRandom<ManyParams>()
    val a32 by aRandom<ManyParams>()
    val a33 by aRandom<ManyParams>()
    val a34 by aRandom<ManyParams>()
    val a35 by aRandom<ManyParams>()
    val a36 by aRandom<ManyParams>()
    val a37 by aRandom<ManyParams>()
    val a38 by aRandom<ManyParams>()
    val a39 by aRandom<ManyParams>()
    val a40 by aRandom<ManyParams>()
    val a41 by aRandom<ManyParams>()
    val a42 by aRandom<ManyParams>()
    val a43 by aRandom<ManyParams>()
    val a44 by aRandom<ManyParams>()
    val a45 by aRandom<ManyParams>()
    val a46 by aRandom<ManyParams>()
    val a47 by aRandom<ManyParams>()
    val a48 by aRandom<ManyParams>()
    val a49 by aRandom<ManyParams>()
    val a50 by aRandom<ManyParams>()
    val a51 by aRandom<ManyParams>()
    val a52 by aRandom<ManyParams>()
    val a53 by aRandom<ManyParams>()
    val a54 by aRandom<ManyParams>()
    val a55 by aRandom<ManyParams>()
    val a56 by aRandom<ManyParams>()
    val a57 by aRandom<ManyParams>()
    val a58 by aRandom<ManyParams>()
    val a59 by aRandom<ManyParams>()
    val a60 by aRandom<ManyParams>()
    val a61 by aRandom<ManyParams>()
    val a62 by aRandom<ManyParams>()
    val a63 by aRandom<ManyParams>()
    val a64 by aRandom<ManyParams>()
    val a65 by aRandom<ManyParams>()
    val a66 by aRandom<ManyParams>()
    val a67 by aRandom<ManyParams>()
    val a68 by aRandom<ManyParams>()
    val a69 by aRandom<ManyParams>()
    val a70 by aRandom<ManyParams>()
    val a71 by aRandom<ManyParams>()
    val a72 by aRandom<ManyParams>()
    val a73 by aRandom<ManyParams>()
    val a74 by aRandom<ManyParams>()
    val a75 by aRandom<ManyParams>()
    val a76 by aRandom<ManyParams>()
    val a77 by aRandom<ManyParams>()
    val a78 by aRandom<ManyParams>()
    val a79 by aRandom<ManyParams>()
    val a80 by aRandom<ManyParams>()
    val a81 by aRandom<ManyParams>()
    val a82 by aRandom<ManyParams>()
    val a83 by aRandom<ManyParams>()
    val a84 by aRandom<ManyParams>()
    val a85 by aRandom<ManyParams>()
    val a86 by aRandom<ManyParams>()
    val a87 by aRandom<ManyParams>()
    val a88 by aRandom<ManyParams>()
    val a89 by aRandom<ManyParams>()
    val a90 by aRandom<ManyParams>()
    val a91 by aRandom<ManyParams>()
    val a92 by aRandom<ManyParams>()
    val a93 by aRandom<ManyParams>()
    val a94 by aRandom<ManyParams>()
    val a95 by aRandom<ManyParams>()
    val a96 by aRandom<ManyParams>()
    val a97 by aRandom<ManyParams>()
    val a98 by aRandom<ManyParams>()
    val a99 by aRandom<ManyParams>()
    val a100 by aRandom<ManyParams>()
    val a101 by aRandom<ManyParams>()
    val a102 by aRandom<ManyParams>()
    val a103 by aRandom<ManyParams>()
    val a104 by aRandom<ManyParams>()
    val a105 by aRandom<ManyParams>()
    val a106 by aRandom<ManyParams>()
    val a107 by aRandom<ManyParams>()
    val a108 by aRandom<ManyParams>()
    val a109 by aRandom<ManyParams>()
    val a110 by aRandom<ManyParams>()
    val a111 by aRandom<ManyParams>()
    val a112 by aRandom<ManyParams>()
    val a113 by aRandom<ManyParams>()
    val a114 by aRandom<ManyParams>()
    val a115 by aRandom<ManyParams>()
    val a116 by aRandom<ManyParams>()
    val a117 by aRandom<ManyParams>()
    val a118 by aRandom<ManyParams>()
    val a119 by aRandom<ManyParams>()
    val a120 by aRandom<ManyParams>()
    val a121 by aRandom<ManyParams>()
    val a122 by aRandom<ManyParams>()
    val a123 by aRandom<ManyParams>()
    val a124 by aRandom<ManyParams>()
    val a125 by aRandom<ManyParams>()
    val a126 by aRandom<ManyParams>()
    val a127 by aRandom<ManyParams>()
    val a128 by aRandom<ManyParams>()
    val a129 by aRandom<ManyParams>()
    val a130 by aRandom<ManyParams>()
    val a131 by aRandom<ManyParams>()
    val a132 by aRandom<ManyParams>()
    val a133 by aRandom<ManyParams>()
    val a134 by aRandom<ManyParams>()
    val a135 by aRandom<ManyParams>()
    val a136 by aRandom<ManyParams>()
    val a137 by aRandom<ManyParams>()
    val a138 by aRandom<ManyParams>()
    val a139 by aRandom<ManyParams>()
    val a140 by aRandom<ManyParams>()
    val a141 by aRandom<ManyParams>()
    val a142 by aRandom<ManyParams>()
    val a143 by aRandom<ManyParams>()
    val a144 by aRandom<ManyParams>()
    val a145 by aRandom<ManyParams>()
    val a146 by aRandom<ManyParams>()
    val a147 by aRandom<ManyParams>()
    val a148 by aRandom<ManyParams>()
    val a149 by aRandom<ManyParams>()
    val a150 by aRandom<ManyParams>()
    val a151 by aRandom<ManyParams>()
    val a152 by aRandom<ManyParams>()
    val a153 by aRandom<ManyParams>()
    val a154 by aRandom<ManyParams>()
    val a155 by aRandom<ManyParams>()
    val a156 by aRandom<ManyParams>()
    val a157 by aRandom<ManyParams>()
    val a158 by aRandom<ManyParams>()
    val a159 by aRandom<ManyParams>()
    val a160 by aRandom<ManyParams>()
    val a161 by aRandom<ManyParams>()
    val a162 by aRandom<ManyParams>()
    val a163 by aRandom<ManyParams>()
    val a164 by aRandom<ManyParams>()
    val a165 by aRandom<ManyParams>()
    val a166 by aRandom<ManyParams>()
    val a167 by aRandom<ManyParams>()
    val a168 by aRandom<ManyParams>()
    val a169 by aRandom<ManyParams>()
    val a170 by aRandom<ManyParams>()
    val a171 by aRandom<ManyParams>()
    val a172 by aRandom<ManyParams>()
    val a173 by aRandom<ManyParams>()
    val a174 by aRandom<ManyParams>()
    val a175 by aRandom<ManyParams>()
    val a176 by aRandom<ManyParams>()
    val a177 by aRandom<ManyParams>()
    val a178 by aRandom<ManyParams>()
    val a179 by aRandom<ManyParams>()
    val a180 by aRandom<ManyParams>()
    val a181 by aRandom<ManyParams>()
    val a182 by aRandom<ManyParams>()
    val a183 by aRandom<ManyParams>()
    val a184 by aRandom<ManyParams>()
    val a185 by aRandom<ManyParams>()
    val a186 by aRandom<ManyParams>()
    val a187 by aRandom<ManyParams>()
    val a188 by aRandom<ManyParams>()
    val a189 by aRandom<ManyParams>()
    val a190 by aRandom<ManyParams>()
    val a191 by aRandom<ManyParams>()
    val a192 by aRandom<ManyParams>()
    val a193 by aRandom<ManyParams>()
    val a194 by aRandom<ManyParams>()
    val a195 by aRandom<ManyParams>()
    val a196 by aRandom<ManyParams>()
    val a197 by aRandom<ManyParams>()
    val a198 by aRandom<ManyParams>()
    val a199 by aRandom<ManyParams>()
    val a200 by aRandom<ManyParams>()
    val a201 by aRandom<ManyParams>()
    val a202 by aRandom<ManyParams>()
    val a203 by aRandom<ManyParams>()
    val a204 by aRandom<ManyParams>()
    val a205 by aRandom<ManyParams>()
}

data class Yo(val a: String, val b: Int, val c: Int)
data class I(val x: Yo, val b: Yo, val d: Yo)
//data class ManyParams(val a: String)
data class ManyParams(val a: I, val b: I, val c: I, val d: I, val e: I, val f: I, val g: I, val h: I)

fun getString() = Random(0).let { RandomStringUtils.random(Math.max(1, it.nextInt(9)), 0, 6000, true, true, null, it) }
fun getInt() = Random(0).nextInt()
fun getYo()= Yo::class.constructors.first().call(getString(), getInt(), getInt())
fun getI()= I::class.constructors.first().call(getYo(), getYo(), getYo())
fun getMP()= ManyParams::class.constructors.first().call(getI(), getI(), getI(), getI(), getI(), getI(), getI(), getI())
