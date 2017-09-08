/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fede
 */
public class CPU extends CPUAbs{

    MemoryCPU memory;
    ProcessorCPU processor;
    
    public CPU()
    {
        memory=new MemoryCPU();
        processor=new ProcessorCPU();
    }
    
    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+memory.getPrice()+processor.getPrice();
    }
    
    public MemoryCPU getMemory() {
        return memory;
    }

    public void setMemory(MemoryCPU memory) {
        this.memory = memory;
    }

    public ProcessorCPU getProcessor() {
        return processor;
    }

    public void setProcessor(ProcessorCPU processor) {
        this.processor = processor;
    }
    
}
