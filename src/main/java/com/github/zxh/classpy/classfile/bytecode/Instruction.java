package com.github.zxh.classpy.classfile.bytecode;

import com.github.zxh.classpy.classfile.ClassComponent;
import com.github.zxh.classpy.classfile.ClassReader;

/**
 *
 * @author zxh
 */
public class Instruction extends ClassComponent {

    protected final Opcode opcode;

    public Instruction(Opcode opcode) {
        this.opcode = opcode;
        setName(opcode.name());
    }
    
    @Override
    protected void readContent(ClassReader reader) {
        // todo
        reader.readU1();
        for (int i = 0; i < opcode.operandCount; i++) {
            reader.readU1();
        }
    }
    
    
    public static Instruction create(Opcode opcode) {
        switch (opcode) {
//            case aconst_null:
            // todo
            default: return new Instruction(opcode);
        }
    }
    
}